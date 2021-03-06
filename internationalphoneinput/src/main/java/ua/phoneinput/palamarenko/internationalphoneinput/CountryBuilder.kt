package ua.phoneinput.palamarenko.internationalphoneinput


class CountryFlagModel(
    val mask: String,
    val cc: String,
    val name: String,
    var freeMask: String = "",
    var cipher: String = ""
)


class CountryBuilder {

     companion object {
         fun generationList() : List<CountryFlagModel> {
             return ArrayList<CountryFlagModel>().apply {
                 add(CountryFlagModel(mask = "+247-####", cc = "AC", name = "Ascension"))
                 add(CountryFlagModel(mask = "+376-###-###", cc = "AD", name = "Andorra"))
                 add(CountryFlagModel(mask = "+971-5#-###-####", cc = "AE", name = "United Arab Emirates"))
                 add(CountryFlagModel(mask = "+971-#-###-####", cc = "AE", name = "United Arab Emirates"))
                 add(CountryFlagModel(mask = "+93-##-###-####", cc = "AF", name = "Afghanistan"))
                 add(CountryFlagModel(mask = "+1(268)###-####", cc = "AG", name = "Antigua & Barbuda"))
                 add(CountryFlagModel(mask = "+1(264)###-####", cc = "AI", name = "Anguilla"))
                 add(CountryFlagModel(mask = "+355(###)###-###", cc = "AL", name = "Albania"))
                 add(CountryFlagModel(mask = "+374-##-###-###", cc = "AM", name = "Armenia"))
                 add(CountryFlagModel(mask = "+599-###-####", cc = "AN", name = "Caribbean Netherlands"))
                 add(CountryFlagModel(mask = "+599-###-####", cc = "AN", name = "Netherlands Antilles"))
                 add(CountryFlagModel(mask = "+599-9###-####", cc = "AN", name = "Netherlands Antilles"))
                 add(CountryFlagModel(mask = "+244(###)###-###", cc = "AO", name = "Angola"))
                 add(CountryFlagModel(mask = "+672-1##-###", cc = "AQ", name = "Australian bases in Antarctica"))
                 add(CountryFlagModel(mask = "+54(###)###-####", cc = "AR", name = "Argentina"))
                 add(CountryFlagModel(mask = "+1(684)###-####", cc = "AS", name = "American Samoa"))
                 add(CountryFlagModel(mask = "+43(###)###-####", cc = "AT", name = "Austria"))
                 add(CountryFlagModel(mask = "+61-#-####-####", cc = "AU", name = "Australia"))
                 add(CountryFlagModel(mask = "+297-###-####", cc = "AW", name = "Aruba"))
                 add(CountryFlagModel(mask = "+994-##-###-##-##", cc = "AZ", name = "Azerbaijan"))
                 add(CountryFlagModel(mask = "+387-##-#####", cc = "BA", name = "Bosnia and Herzegovina"))
                 add(CountryFlagModel(mask = "+387-##-####", cc = "BA", name = "Bosnia and Herzegovina"))
                 add(CountryFlagModel(mask = "+1(246)###-####", cc = "BB", name = "Barbados"))
                 add(CountryFlagModel(mask = "+880-##-###-###", cc = "BD", name = "Bangladesh"))
                 add(CountryFlagModel(mask = "+32(###)###-###", cc = "BE", name = "Belgium"))
                 add(CountryFlagModel(mask = "+226-##-##-####", cc = "BF", name = "Burkina Faso"))
                 add(CountryFlagModel(mask = "+359(###)###-###", cc = "BG", name = "Bulgaria"))
                 add(CountryFlagModel(mask = "+973-####-####", cc = "BH", name = "Bahrain"))
                 add(CountryFlagModel(mask = "+257-##-##-####", cc = "BI", name = "Burundi"))
                 add(CountryFlagModel(mask = "+229-##-##-####", cc = "BJ", name = "Benin"))
                 add(CountryFlagModel(mask = "+1(441)###-####", cc = "BM", name = "Bermuda"))
                 add(CountryFlagModel(mask = "+673-###-####", cc = "BN", name = "Brunei Darussalam"))
                 add(CountryFlagModel(mask = "+591-#-###-####", cc = "BO", name = "Bolivia"))
                 add(CountryFlagModel(mask = "+55(##)####-####", cc = "BR", name = "Brazil"))
                 add(CountryFlagModel(mask = "+55(##)7###-####", cc = "BR", name = "Brazil"))
                 add(CountryFlagModel(mask = "+55(##)9####-####", cc = "BR", name = "Brazil"))
                 add(CountryFlagModel(mask = "+1(242)###-####", cc = "BS", name = "Bahamas"))
                 add(CountryFlagModel(mask = "+975-17-###-###", cc = "BT", name = "Bhutan"))
                 add(CountryFlagModel(mask = "+975-#-###-###", cc = "BT", name = "Bhutan"))
                 add(CountryFlagModel(mask = "+267-##-###-###", cc = "BW", name = "Botswana"))
                 add(CountryFlagModel(mask = "+375(##)###-##-##", cc = "BY", name = "Belarus"))
                 add(CountryFlagModel(mask = "+501-###-####", cc = "BZ", name = "Belize"))
                 add(CountryFlagModel(mask = "+243(###)###-###", cc = "CD", name = "Dem. Rep. Congo"))
                 add(CountryFlagModel(mask = "+236-##-##-####", cc = "CF", name = "Central African Republic"))
                 add(CountryFlagModel(mask = "+242-##-###-####", cc = "CG", name = "Congo (Brazzaville)"))
                 add(CountryFlagModel(mask = "+41-##-###-####", cc = "CH", name = "Switzerland"))
                 add(CountryFlagModel(mask = "+225-##-###-###", cc = "CI", name = "Cote d’Ivoire (Ivory Coast)"))
                 add(CountryFlagModel(mask = "+682-##-###", cc = "CK", name = "Cook Islands"))
                 add(CountryFlagModel(mask = "+56-#-####-####", cc = "CL", name = "Chile"))
                 add(CountryFlagModel(mask = "+237-####-####", cc = "CM", name = "Cameroon"))
                 add(CountryFlagModel(mask = "+86(###)####-####", cc = "CN", name = "China (PRC)"))
                 add(CountryFlagModel(mask = "+86(###)####-###", cc = "CN", name = "China (PRC)"))
                 add(CountryFlagModel(mask = "+86-##-#####-#####", cc = "CN", name = "China (PRC)"))
                 add(CountryFlagModel(mask = "+57(###)###-####", cc = "CO", name = "Colombia"))
                 add(CountryFlagModel(mask = "+506-####-####", cc = "CR", name = "Costa Rica"))
                 add(CountryFlagModel(mask = "+53-#-###-####", cc = "CU", name = "Cuba"))
                 add(CountryFlagModel(mask = "+238(###)##-##", cc = "CV", name = "Cape Verde"))
                 add(CountryFlagModel(mask = "+599-###-####", cc = "CW", name = "Curacao"))
                 add(CountryFlagModel(mask = "+357-##-###-###", cc = "CY", name = "Cyprus"))
                 add(CountryFlagModel(mask = "+420(###)###-###", cc = "CZ", name = "Czech Republic"))
                 add(CountryFlagModel(mask = "+49(####)###-####", cc = "DE", name = "Germany"))
                 add(CountryFlagModel(mask = "+49(###)###-####", cc = "DE", name = "Germany"))
                 add(CountryFlagModel(mask = "+49(###)##-####", cc = "DE", name = "Germany"))
                 add(CountryFlagModel(mask = "+49(###)##-###", cc = "DE", name = "Germany"))
                 add(CountryFlagModel(mask = "+49(###)##-##", cc = "DE", name = "Germany"))
                 add(CountryFlagModel(mask = "+49-###-###", cc = "DE", name = "Germany"))
                 add(CountryFlagModel(mask = "+253-##-##-##-##", cc = "DJ", name = "Djibouti"))
                 add(CountryFlagModel(mask = "+45-##-##-##-##", cc = "DK", name = "Denmark"))
                 add(CountryFlagModel(mask = "+1(767)###-####", cc = "DM", name = "Dominica"))
                 add(CountryFlagModel(mask = "+1(809)###-####", cc = "DO", name = "Dominican Republic"))
                 add(CountryFlagModel(mask = "+1(829)###-####", cc = "DO", name = "Dominican Republic"))
                 add(CountryFlagModel(mask = "+1(849)###-####", cc = "DO", name = "Dominican Republic"))
                 add(CountryFlagModel(mask = "+213-##-###-####", cc = "DZ", name = "Algeria"))
                 add(CountryFlagModel(mask = "+593-##-###-####", cc = "EC", name = "Ecuador"))
                 add(CountryFlagModel(mask = "+593-#-###-####", cc = "EC", name = "Ecuador"))
                 add(CountryFlagModel(mask = "+372-####-####", cc = "EE", name = "Estonia"))
                 add(CountryFlagModel(mask = "+372-###-####", cc = "EE", name = "Estonia"))
                 add(CountryFlagModel(mask = "+20(###)###-####", cc = "EG", name = "Egypt"))
                 add(CountryFlagModel(mask = "+291-#-###-###", cc = "ER", name = "Eritrea"))
                 add(CountryFlagModel(mask = "+34(###)###-###", cc = "ES", name = "Spain"))
                 add(CountryFlagModel(mask = "+251-##-###-####", cc = "ET", name = "Ethiopia"))
                 add(CountryFlagModel(mask = "+358(###)###-##-##", cc = "FI", name = "Finland"))
                 add(CountryFlagModel(mask = "+679-##-#####", cc = "FJ", name = "Fiji"))
                 add(CountryFlagModel(mask = "+500-#####", cc = "FK", name = "Falkland Islands"))
                 add(CountryFlagModel(mask = "+691-###-####", cc = "FM", name = "F.S. Micronesia"))
                 add(CountryFlagModel(mask = "+298-###-###", cc = "FO", name = "Faroe Islands"))
                 add(CountryFlagModel(mask = "+262-#####-####", cc = "FR", name = "Mayotte"))
                 add(CountryFlagModel(mask = "+33(###)###-###", cc = "FR", name = "France"))
                 add(CountryFlagModel(mask = "+508-##-####", cc = "FR", name = "St Pierre & Miquelon"))
                 add(CountryFlagModel(mask = "+590(###)###-###", cc = "FR", name = "Guadeloupe"))
                 add(CountryFlagModel(mask = "+241-#-##-##-##", cc = "GA", name = "Gabon"))
                 add(CountryFlagModel(mask = "+1(473)###-####", cc = "GD", name = "Grenada"))
                 add(CountryFlagModel(mask = "+995(###)###-###", cc = "GE", name = "Rep. of Georgia"))
                 add(CountryFlagModel(mask = "+594-#####-####", cc = "GF", name = "Guiana (French)"))
                 add(CountryFlagModel(mask = "+233(###)###-###", cc = "GH", name = "Ghana"))
                 add(CountryFlagModel(mask = "+350-###-#####", cc = "GI", name = "Gibraltar"))
                 add(CountryFlagModel(mask = "+299-##-##-##", cc = "GL", name = "Greenland"))
                 add(CountryFlagModel(mask = "+220(###)##-##", cc = "GM", name = "Gambia"))
                 add(CountryFlagModel(mask = "+224-##-###-###", cc = "GN", name = "Guinea"))
                 add(CountryFlagModel(mask = "+240-##-###-####", cc = "GQ", name = "Equatorial Guinea"))
                 add(CountryFlagModel(mask = "+30(###)###-####", cc = "GR", name = "Greece"))
                 add(CountryFlagModel(mask = "+502-#-###-####", cc = "GT", name = "Guatemala"))
                 add(CountryFlagModel(mask = "+1(671)###-####", cc = "GU", name = "Guam"))
                 add(CountryFlagModel(mask = "+245-#-######", cc = "GW", name = "Guinea-Bissau"))
                 add(CountryFlagModel(mask = "+592-###-####", cc = "GY", name = "Guyana"))
                 add(CountryFlagModel(mask = "+852-####-####", cc = "HK", name = "Hong Kong"))
                 add(CountryFlagModel(mask = "+504-####-####", cc = "HN", name = "Honduras"))
                 add(CountryFlagModel(mask = "+385-##-###-###", cc = "HR", name = "Croatia"))
                 add(CountryFlagModel(mask = "+509-##-##-####", cc = "HT", name = "Haiti"))
                 add(CountryFlagModel(mask = "+36(###)###-###", cc = "HU", name = "Hungary"))
                 add(CountryFlagModel(mask = "+62(8##)###-####", cc = "ID", name = "Indonesia"))
                 add(CountryFlagModel(mask = "+62-##-###-##", cc = "ID", name = "Indonesia"))
                 add(CountryFlagModel(mask = "+62-##-###-###", cc = "ID", name = "Indonesia"))
                 add(CountryFlagModel(mask = "+62-##-###-####", cc = "ID", name = "Indonesia"))
                 add(CountryFlagModel(mask = "+62(8##)###-###", cc = "ID", name = "Indonesia"))
                 add(CountryFlagModel(mask = "+62(8##)###-##-###", cc = "ID", name = "Indonesia"))
                 add(CountryFlagModel(mask = "+353(###)###-###", cc = "IE", name = "Ireland"))
                 add(CountryFlagModel(mask = "+972-5#-###-####", cc = "IL", name = "Israel"))
                 add(CountryFlagModel(mask = "+972-#-###-####", cc = "IL", name = "Israel"))
                 add(CountryFlagModel(mask = "+91(####)###-###", cc = "IN", name = "India"))
                 add(CountryFlagModel(mask = "+246-###-####", cc = "IO", name = "Diego Garcia"))
                 add(CountryFlagModel(mask = "+964(###)###-####", cc = "IQ", name = "Iraq"))
                 add(CountryFlagModel(mask = "+98(###)###-####", cc = "IR", name = "Iran"))
                 add(CountryFlagModel(mask = "+354-###-####", cc = "IS", name = "Iceland"))
                 add(CountryFlagModel(mask = "+39(###)####-###", cc = "IT", name = "Italy"))
                 add(CountryFlagModel(mask = "+1(876)###-####", cc = "JM", name = "Jamaica"))
                 add(CountryFlagModel(mask = "+962-#-####-####", cc = "JO", name = "Jordan"))
                 add(CountryFlagModel(mask = "+81-##-####-####", cc = "JP", name = "Japan "))
                 add(CountryFlagModel(mask = "+81(###)###-###", cc = "JP", name = "Japan"))
                 add(CountryFlagModel(mask = "+254-###-######", cc = "KE", name = "Kenya"))
                 add(CountryFlagModel(mask = "+996(###)###-###", cc = "KG", name = "Kyrgyzstan"))
                 add(CountryFlagModel(mask = "+855-##-###-###", cc = "KH", name = "Cambodia"))
                 add(CountryFlagModel(mask = "+686-##-###", cc = "KI", name = "Kiribati"))
                 add(CountryFlagModel(mask = "+269-##-#####", cc = "KM", name = "Comoros"))
                 add(CountryFlagModel(mask = "+1(869)###-####", cc = "KN", name = "Saint Kitts & Nevis"))
                 add(CountryFlagModel(mask = "+850-191-###-####", cc = "KP", name = "DPR Korea (North) "))
                 add(CountryFlagModel(mask = "+850-##-###-###", cc = "KP", name = "DPR Korea (North)"))
                 add(CountryFlagModel(mask = "+850-###-####-###", cc = "KP", name = "DPR Korea (North)"))
                 add(CountryFlagModel(mask = "+850-###-###", cc = "KP", name = "DPR Korea (North)"))
                 add(CountryFlagModel(mask = "+850-####-####", cc = "KP", name = "DPR Korea (North)"))
                 add(CountryFlagModel(mask = "+850-####-#############", cc = "KP", name = "DPR Korea (North)"))
                 add(CountryFlagModel(mask = "+82-##-###-####", cc = "KR", name = "Korea (South)"))
                 add(CountryFlagModel(mask = "+965-####-####", cc = "KW", name = "Kuwait"))
                 add(CountryFlagModel(mask = "+1(345)###-####", cc = "KY", name = "Cayman Islands"))
                 add(CountryFlagModel(mask = "+7(6##)###-##-##", cc = "KZ", name = "Kazakhstan"))
                 add(CountryFlagModel(mask = "+7(7##)###-##-##", cc = "KZ", name = "Kazakhstan"))
                 add(CountryFlagModel(mask = "+856(20##)###-###", cc = "LA", name = "Laos"))
                 add(CountryFlagModel(mask = "+856-##-###-###", cc = "LA", name = "Laos"))
                 add(CountryFlagModel(mask = "+961-##-###-###", cc = "LB", name = "Lebanon"))
                 add(CountryFlagModel(mask = "+961-#-###-###", cc = "LB", name = "Lebanon"))
                 add(CountryFlagModel(mask = "+1(758)###-####", cc = "LC", name = "Saint Lucia"))
                 add(CountryFlagModel(mask = "+423(###)###-####", cc = "LI", name = "Liechtenstein"))
                 add(CountryFlagModel(mask = "+94-##-###-####", cc = "LK", name = "Sri Lanka"))
                 add(CountryFlagModel(mask = "+231-##-###-###", cc = "LR", name = "Liberia"))
                 add(CountryFlagModel(mask = "+266-#-###-####", cc = "LS", name = "Lesotho"))
                 add(CountryFlagModel(mask = "+370(###)##-###", cc = "LT", name = "Lithuania"))
                 add(CountryFlagModel(mask = "+352(###)###-###", cc = "LU", name = "Luxembourg"))
                 add(CountryFlagModel(mask = "+371-##-###-###", cc = "LV", name = "Latvia"))
                 add(CountryFlagModel(mask = "+218-##-###-###", cc = "LY", name = "Libya"))
                 add(CountryFlagModel(mask = "+218-21-###-####", cc = "LY", name = "Libya"))
                 add(CountryFlagModel(mask = "+212-##-####-###", cc = "MA", name = "Morocco"))
                 add(CountryFlagModel(mask = "+377(###)###-###", cc = "MC", name = "Monaco"))
                 add(CountryFlagModel(mask = "+377-##-###-###", cc = "MC", name = "Monaco"))
                 add(CountryFlagModel(mask = "+373-####-####", cc = "MD", name = "Moldova"))
                 add(CountryFlagModel(mask = "+382-##-###-###", cc = "ME", name = "Montenegro"))
                 add(CountryFlagModel(mask = "+261-##-##-#####", cc = "MG", name = "Madagascar"))
                 add(CountryFlagModel(mask = "+692-###-####", cc = "MH", name = "Marshall Islands"))
                 add(CountryFlagModel(mask = "+389-##-###-###", cc = "MK", name = "Republic of Macedonia"))
                 add(CountryFlagModel(mask = "+223-##-##-####", cc = "ML", name = "Mali"))
                 add(CountryFlagModel(mask = "+95-##-###-###", cc = "MM", name = "Burma (Myanmar)"))
                 add(CountryFlagModel(mask = "+95-#-###-###", cc = "MM", name = "Burma (Myanmar)"))
                 add(CountryFlagModel(mask = "+95-###-###", cc = "MM", name = "Burma (Myanmar)"))
                 add(CountryFlagModel(mask = "+976-##-##-####", cc = "MN", name = "Mongolia"))
                 add(CountryFlagModel(mask = "+853-####-####", cc = "MO", name = "Macau"))
                 add(CountryFlagModel(mask = "+1(670)###-####", cc = "MP", name = "Northern Mariana Islands"))
                 add(CountryFlagModel(mask = "+596(###)##-##-##", cc = "MQ", name = "Martinique"))
                 add(CountryFlagModel(mask = "+222-##-##-####", cc = "MR", name = "Mauritania"))
                 add(CountryFlagModel(mask = "+1(664)###-####", cc = "MS", name = "Montserrat"))
                 add(CountryFlagModel(mask = "+356-####-####", cc = "MT", name = "Malta"))
                 add(CountryFlagModel(mask = "+230-###-####", cc = "MU", name = "Mauritius"))
                 add(CountryFlagModel(mask = "+960-###-####", cc = "MV", name = "Maldives"))
                 add(CountryFlagModel(mask = "+265-1-###-###", cc = "MW", name = "Malawi"))
                 add(CountryFlagModel(mask = "+265-#-####-####", cc = "MW", name = "Malawi"))
                 add(CountryFlagModel(mask = "+52(###)###-####", cc = "MX", name = "Mexico"))
                 add(CountryFlagModel(mask = "+52-##-##-####", cc = "MX", name = "Mexico"))
                 add(CountryFlagModel(mask = "+60-##-###-####", cc = "MY", name = "Malaysia"))
                 add(CountryFlagModel(mask = "+60(###)###-###", cc = "MY", name = "Malaysia"))
                 add(CountryFlagModel(mask = "+60-##-###-###", cc = "MY", name = "Malaysia"))
                 add(CountryFlagModel(mask = "+60-#-###-###", cc = "MY", name = "Malaysia"))
                 add(CountryFlagModel(mask = "+258-##-###-###", cc = "MZ", name = "Mozambique"))
                 add(CountryFlagModel(mask = "+264-##-###-####", cc = "NA", name = "Namibia"))
                 add(CountryFlagModel(mask = "+687-##-####", cc = "NC", name = "New Caledonia"))
                 add(CountryFlagModel(mask = "+227-##-##-####", cc = "NE", name = "Niger"))
                 add(CountryFlagModel(mask = "+672-3##-###", cc = "NF", name = "Norfolk Island"))
                 add(CountryFlagModel(mask = "+234(###)###-####", cc = "NG", name = "Nigeria"))
                 add(CountryFlagModel(mask = "+234-##-###-###", cc = "NG", name = "Nigeria"))
                 add(CountryFlagModel(mask = "+234-##-###-##", cc = "NG", name = "Nigeria"))
                 add(CountryFlagModel(mask = "+234(###)###-####", cc = "NG", name = "Nigeria"))
                 add(CountryFlagModel(mask = "+505-####-####", cc = "NI", name = "Nicaragua"))
                 add(CountryFlagModel(mask = "+31-##-###-####", cc = "NL", name = "Netherlands"))
                 add(CountryFlagModel(mask = "+47(###)##-###", cc = "NO", name = "Norway"))
                 add(CountryFlagModel(mask = "+977-##-###-###", cc = "NP", name = "Nepal"))
                 add(CountryFlagModel(mask = "+674-###-####", cc = "NR", name = "Nauru"))
                 add(CountryFlagModel(mask = "+683-####", cc = "NU", name = "Niue"))
                 add(CountryFlagModel(mask = "+64(###)###-###", cc = "NZ", name = "New Zealand"))
                 add(CountryFlagModel(mask = "+64-##-###-###", cc = "NZ", name = "New Zealand"))
                 add(CountryFlagModel(mask = "+64(###)###-####", cc = "NZ", name = "New Zealand"))
                 add(CountryFlagModel(mask = "+968-##-###-###", cc = "OM", name = "Oman"))
                 add(CountryFlagModel(mask = "+507-###-####", cc = "PA", name = "Panama"))
                 add(CountryFlagModel(mask = "+51(###)###-###", cc = "PE", name = "Peru"))
                 add(CountryFlagModel(mask = "+689-##-##-##", cc = "PF", name = "French Polynesia"))
                 add(CountryFlagModel(mask = "+675(###)##-###", cc = "PG", name = "Papua New Guinea"))
                 add(CountryFlagModel(mask = "+63(###)###-####", cc = "PH", name = "Philippines"))
                 add(CountryFlagModel(mask = "+92(###)###-####", cc = "PK", name = "Pakistan"))
                 add(CountryFlagModel(mask = "+48(###)###-###", cc = "PL", name = "Poland"))
                 add(CountryFlagModel(mask = "+970-##-###-####", cc = "PS", name = "Palestine"))
                 add(CountryFlagModel(mask = "+351-##-###-####", cc = "PT", name = "Portugal"))
                 add(CountryFlagModel(mask = "+680-###-####", cc = "PW", name = "Palau"))
                 add(CountryFlagModel(mask = "+595(###)###-###", cc = "PY", name = "Paraguay"))
                 add(CountryFlagModel(mask = "+974-####-####", cc = "QA", name = "Qatar"))
                 add(CountryFlagModel(mask = "+262-#####-####", cc = "RE", name = "Reunion"))
                 add(CountryFlagModel(mask = "+40-##-###-####", cc = "RO", name = "Romania"))
                 add(CountryFlagModel(mask = "+381-##-###-####", cc = "RS", name = "Serbia"))
                 add(CountryFlagModel(mask = "+7(###)###-##-##", cc = "RU", name = "Russia"))
                 add(CountryFlagModel(mask = "+250(###)###-###", cc = "RW", name = "Rwanda"))
                 add(CountryFlagModel(mask = "+966-5-####-####", cc = "SA", name = "Saudi Arabia"))
                 add(CountryFlagModel(mask = "+966-#-###-####", cc = "SA", name = "Saudi Arabia"))
                 add(CountryFlagModel(mask = "+677-###-####", cc = "SB", name = "Solomon Islands"))
                 add(CountryFlagModel(mask = "+677-#####", cc = "SB", name = "Solomon Islands"))
                 add(CountryFlagModel(mask = "+248-#-###-###", cc = "SC", name = "Seychelles"))
                 add(CountryFlagModel(mask = "+249-##-###-####", cc = "SD", name = "Sudan"))
                 add(CountryFlagModel(mask = "+46-##-###-####", cc = "SE", name = "Sweden"))
                 add(CountryFlagModel(mask = "+65-####-####", cc = "SG", name = "Singapore"))
                 add(CountryFlagModel(mask = "+290-####", cc = "SH", name = "Saint Helena"))
                 add(CountryFlagModel(mask = "+290-####", cc = "SH", name = "Tristan da Cunha"))
                 add(CountryFlagModel(mask = "+386-##-###-###", cc = "SI", name = "Slovenia"))
                 add(CountryFlagModel(mask = "+421(###)###-###", cc = "SK", name = "Slovakia"))
                 add(CountryFlagModel(mask = "+232-##-######", cc = "SL", name = "Sierra Leone"))
                 add(CountryFlagModel(mask = "+378-####-######", cc = "SM", name = "San Marino"))
                 add(CountryFlagModel(mask = "+221-##-###-####", cc = "SN", name = "Senegal"))
                 add(CountryFlagModel(mask = "+252-##-###-###", cc = "SO", name = "Somalia"))
                 add(CountryFlagModel(mask = "+252-#-###-###", cc = "SO", name = "Somalia"))
                 add(CountryFlagModel(mask = "+252-#-###-###", cc = "SO", name = "Somalia"))
                 add(CountryFlagModel(mask = "+597-###-####", cc = "SR", name = "Suriname"))
                 add(CountryFlagModel(mask = "+597-###-###", cc = "SR", name = "Suriname"))
                 add(CountryFlagModel(mask = "+211-##-###-####", cc = "SS", name = "South Sudan"))
                 add(CountryFlagModel(mask = "+239-##-#####", cc = "ST", name = "Sao Tome and Principe"))
                 add(CountryFlagModel(mask = "+503-##-##-####", cc = "SV", name = "El Salvador"))
                 add(CountryFlagModel(mask = "+1(721)###-####", cc = "SX", name = "Sint Maarten"))
                 add(CountryFlagModel(mask = "+963-##-####-###", cc = "SY", name = "Syrian Arab Republic"))
                 add(CountryFlagModel(mask = "+268-##-##-####", cc = "SZ", name = "Swaziland"))
                 add(CountryFlagModel(mask = "+1(649)###-####", cc = "TC", name = "Turks & Caicos"))
                 add(CountryFlagModel(mask = "+235-##-##-##-##", cc = "TD", name = "Chad"))
                 add(CountryFlagModel(mask = "+228-##-###-###", cc = "TG", name = "Togo"))
                 add(CountryFlagModel(mask = "+66-##-###-####", cc = "TH", name = "Thailand"))
                 add(CountryFlagModel(mask = "+66-##-###-###", cc = "TH", name = "Thailand"))
                 add(CountryFlagModel(mask = "+992-##-###-####", cc = "TJ", name = "Tajikistan"))
                 add(CountryFlagModel(mask = "+690-####", cc = "TK", name = "Tokelau"))
                 add(CountryFlagModel(mask = "+670-###-####", cc = "TL", name = "East Timor"))
                 add(CountryFlagModel(mask = "+670-77#-#####", cc = "TL", name = "East Timor"))
                 add(CountryFlagModel(mask = "+670-78#-#####", cc = "TL", name = "East Timor"))
                 add(CountryFlagModel(mask = "+993-#-###-####", cc = "TM", name = "Turkmenistan"))
                 add(CountryFlagModel(mask = "+216-##-###-###", cc = "TN", name = "Tunisia"))
                 add(CountryFlagModel(mask = "+676-#####", cc = "TO", name = "Tonga"))
                 add(CountryFlagModel(mask = "+90(###)###-####", cc = "TR", name = "Turkey"))
                 add(CountryFlagModel(mask = "+1(868)###-####", cc = "TT", name = "Trinidad & Tobago"))
                 add(CountryFlagModel(mask = "+688-90####", cc = "TV", name = "Tuvalu"))
                 add(CountryFlagModel(mask = "+688-2####", cc = "TV", name = "Tuvalu"))
                 add(CountryFlagModel(mask = "+886-#-####-####", cc = "TW", name = "Taiwan"))
                 add(CountryFlagModel(mask = "+886-####-####", cc = "TW", name = "Taiwan"))
                 add(CountryFlagModel(mask = "+255-##-###-####", cc = "TZ", name = "Tanzania"))
                 add(CountryFlagModel(mask = "+380(##)###-##-##", cc = "UA", name = "Ukraine"))
                 add(CountryFlagModel(mask = "+256(###)###-###", cc = "UG", name = "Uganda"))
                 add(CountryFlagModel(mask = "+44-##-####-####", cc = "UK", name = "United Kingdom"))
                 add(CountryFlagModel(mask = "+598-#-###-##-##", cc = "UY", name = "Uruguay"))
                 add(CountryFlagModel(mask = "+998-##-###-####", cc = "UZ", name = "Uzbekistan"))
                 add(CountryFlagModel(mask = "+39-6-698-#####", cc = "VA", name = "Vatican City"))
                 add(CountryFlagModel(mask = "+1(784)###-####", cc = "VC", name = "Saint Vincent & the Grenadines"))
                 add(CountryFlagModel(mask = "+58(###)###-####", cc = "VE", name = "Venezuela"))
                 add(CountryFlagModel(mask = "+1(284)###-####", cc = "VG", name = "British Virgin Islands"))
                 add(CountryFlagModel(mask = "+1(340)###-####", cc = "VI", name = "US Virgin Islands"))
                 add(CountryFlagModel(mask = "+84-##-####-###", cc = "VN", name = "Vietnam"))
                 add(CountryFlagModel(mask = "+84(###)####-###", cc = "VN", name = "Vietnam"))
                 add(CountryFlagModel(mask = "+678-##-#####", cc = "VU", name = "Vanuatu"))
                 add(CountryFlagModel(mask = "+678-#####", cc = "VU", name = "Vanuatu"))
                 add(CountryFlagModel(mask = "+681-##-####", cc = "WF", name = "Wallis and Futuna"))
                 add(CountryFlagModel(mask = "+685-##-####", cc = "WS", name = "Samoa"))
                 add(CountryFlagModel(mask = "+967-###-###-###", cc = "YE", name = "Yemen"))
                 add(CountryFlagModel(mask = "+967-#-###-###", cc = "YE", name = "Yemen"))
                 add(CountryFlagModel(mask = "+967-##-###-###", cc = "YE", name = "Yemen"))
                 add(CountryFlagModel(mask = "+27-##-###-####", cc = "ZA", name = "South Africa"))
                 add(CountryFlagModel(mask = "+260-##-###-####", cc = "ZM", name = "Zambia"))
                 add(CountryFlagModel(mask = "+263-#-######", cc = "ZW", name = "Zimbabwe"))
                 add(CountryFlagModel(mask = "+1(###)###-####", cc = "CA", name = "Canada"))
                 add(CountryFlagModel(mask = "+1(###)###-####", cc = "US", name = "USA"))}
         }
     }
}