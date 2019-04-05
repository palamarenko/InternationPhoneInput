package ua.phoneinput.palamarenko.phoneinputexemple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import ua.phoneinput.palamarenko.internationalphoneinput.PhoneInputUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PhoneInputUtils.setupPhoneMask(findViewById<EditText>(R.id.etPhone),findViewById<ImageView>(R.id.ivImage),{

        },{

        })

    }
}
