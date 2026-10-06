object Excepciones {
    fun enteros (num: String): Boolean{
        try {
            num.toInt()
            return true
        } catch (e: NumberFormatException){
            return false
        }
    }

    fun decimales (num: String): Boolean{
        try {
            num.toDouble()
            return true
        } catch (e: NumberFormatException){
            return false
        }
    }
}