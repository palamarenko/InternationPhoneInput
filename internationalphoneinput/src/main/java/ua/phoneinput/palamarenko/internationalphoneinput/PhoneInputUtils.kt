package ua.phoneinput.palamarenko.internationalphoneinput

import android.content.Context
import android.support.v4.util.ArrayMap
import android.widget.EditText
import android.widget.ImageView
import ru.tinkoff.decoro.FormattedTextChangeListener
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.parser.PhoneNumberUnderscoreSlotsParser
import ru.tinkoff.decoro.watchers.FormatWatcher
import ru.tinkoff.decoro.watchers.MaskFormatWatcher
import java.util.*

class PhoneInputUtils {

    companion object {
        fun setupPhoneMask(
            editText: EditText, icon: ImageView? = null,
            countryListener: (CountryFlagModel?) -> Unit = {},
            validListener: (Boolean) -> Unit = {}
        ): FormatWatcher {


            var currentCountry: CountryFlagModel? = null
            val inputMask = MaskImpl.createNonTerminated(PhoneNumberUnderscoreSlotsParser().parseSlots("+_"))
            val formatWatcher = MaskFormatWatcher(inputMask)
            formatWatcher.installOn(editText)
            var tempOldValue: String? = null
            val phoneTranslater = editText.context.getPhoneCodeTranslater()
            formatWatcher.setCallback(object : FormattedTextChangeListener {
                override fun beforeFormatting(oldValue: String?, newValue: String?): Boolean {

                    tempOldValue = oldValue?.replace(Regex("[+()-]"), "")
                    val number = newValue?.replace(Regex("[+()-]"), "") ?: ""
                    if (number.isEmpty()) {
                        inputMask.clear()
                        formatWatcher.swapMask(inputMask)
                        currentCountry = null
                        setCountry(currentCountry,countryListener,icon)
                    } else {
                        val country = phoneTranslater.getPhoneMask(number)
                        if (country != null) {
                            if (country != currentCountry) {
                                currentCountry = country
                                val inputMask =
                                    MaskImpl.createTerminated(PhoneNumberUnderscoreSlotsParser().parseSlots(country.freeMask))
                                inputMask.insertFront(number)
                                formatWatcher.swapMask(inputMask)

                                setCountry(currentCountry,countryListener,icon)
                            }
                        } else {
                            if (tempOldValue.isNullOrEmpty() || currentCountry == null) {
                                inputMask.clear()
                                formatWatcher.swapMask(inputMask)
                                currentCountry = null
                                setCountry(currentCountry,countryListener,icon)
                            } else {
                                val inputMask =
                                    MaskImpl.createTerminated(
                                        PhoneNumberUnderscoreSlotsParser().parseSlots(
                                            currentCountry!!.freeMask
                                        )
                                    )
                                inputMask.insertFront(tempOldValue)
                                formatWatcher.swapMask(inputMask)
                            }
                        }
                    }
                    return false
                }

                override fun onTextFormatted(formatter: FormatWatcher?, newFormattedText: String?) {
                    validListener.invoke(
                        currentCountry != null && newFormattedText != null && mathPhoneByMask(
                            newFormattedText,
                            currentCountry?.mask
                        )
                    )
                }
            })
            return formatWatcher


        }

        fun setCountry(flag: CountryFlagModel?, countryListener: (CountryFlagModel?) -> Unit, imageView: ImageView?) {


            if (imageView != null) {
                var code =flag?.cc?.toLowerCase()?:""

                if(code=="do") code = "_do"

                val id =
                    imageView.context.resources.getIdentifier(code, "drawable", imageView.context.packageName)
                imageView.setImageResource(id)
            }

            countryListener(flag)

        }


        private fun mathPhoneByMask(phone: String?, mask: String?): Boolean {

            if (mask == null || phone == null) {
                return false
            }


            if (mask.length != phone.length) {
                return false
            }



            for (i in 0 until mask.length) {

                if (mask[i] != phone[i] && (mask[i] != '#' && phone[i].isDigit())) {
                    return false
                }
            }

            return true
        }


        fun Context.getPhoneCodeTranslater(): CountryDecisionTree {
            val countryFlagModels = CountryBuilder.generationList()
            for (i in countryFlagModels) {
                i.freeMask = i.mask.replace(Regex("[0-9#]"), "_")
                i.cipher = i.mask.replace(Regex("[+()-]"), "").replace('#', '.')
            }
            val tree = CountryDecisionTree()
            tree.fillDecisionTree(countryFlagModels)
            return tree
        }

        class CountryDecisionTree {
            val root = Node()

            fun fillDecisionTree(models: List<CountryFlagModel>) {
                for (i in models) {
                    addPhoneMask(i)
                }
            }

            fun addPhoneMask(country: CountryFlagModel) {
                val phoneMaskCode = "${country.cipher}!"
                var curNode = root
                for (digit in phoneMaskCode) {
                    if (digit != '!') { // if char isn't an end of mask code
                        if (curNode.next.contains(digit)) {
                            curNode = curNode.next[digit]!! // if next node already exists move to it and continue
                            continue
                        } else {
                            val newNode = Node()
                            curNode.next[digit] = newNode // if node not exists - create and move to it and continue
                            curNode = newNode
                            continue
                        }
                    } else {
                        curNode.country = country // when code ends write down country
                    }
                }
            }

            fun getPhoneMask(phone: String): CountryFlagModel? {
                if (phone == "") return null
                val possibleCandidates = Stack<Pair<Int, Node>>()
                var curNode = root
                var i = 0
                while (i < phone.length) {
                    val digit = phone[i]
                    if (curNode.next.contains(digit)) {
                        if (curNode.next.contains('.')) // if node with this digit exists but also exists general mask
                            possibleCandidates.push(Pair(i, curNode.next['.']!!))
                        curNode = curNode.next[digit]!! // if node with this digit exists move to it
                        i++
                        continue
                    } else if (curNode.next.contains('.')) {
                        curNode =
                            curNode.next['.']!! // if node with this digits doesn't exists but some mask has free space on that place
                        i++
                        continue
                    } else { // seems phone is not valid
                        if (possibleCandidates.size != 0) {
                            val possibleCandidate = possibleCandidates.pop()
                            i = possibleCandidate.first
                            curNode = possibleCandidate.second
                            i++
                            continue
                        } else {
                            return null
                        }
                    }
                }
                while (curNode.country == null) { // if curNode is not last find most common least number mask
                    if (curNode.next.contains('.')) { // going down the most common way
                        curNode =
                            curNode.next['.']!! // if node with this digits doesn't exists but some mask has free space on that place
                        continue
                    } else {
                        curNode =
                            curNode.next.valueAt(0) // must not throw because  if node have no country it has to have at least one node next
                        continue
                    }
                }
                return curNode.country
            }


            class Node {
                var country: CountryFlagModel? = null
                var next: ArrayMap<Char, Node> = ArrayMap()
            }
        }

    }


}