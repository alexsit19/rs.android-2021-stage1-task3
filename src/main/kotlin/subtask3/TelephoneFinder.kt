package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val resultArray: MutableList<String>? = mutableListOf()

        for ((index, char) in number.withIndex()) {
            when(char) {
                '1' -> {
                    resultArray?.add(createNewString(index, number, '2'))
                    resultArray?.add(createNewString(index, number, '4'))
                }
                '2' -> {
                    resultArray?.add(createNewString(index, number, '1'))
                    resultArray?.add(createNewString(index, number, '5'))
                    resultArray?.add(createNewString(index, number, '3'))
                }
                '3' -> {
                    resultArray?.add(createNewString(index, number, '2'))
                    resultArray?.add(createNewString(index, number, '6'))
                }
                '4' -> {
                    resultArray?.add(createNewString(index, number, '1'))
                    resultArray?.add(createNewString(index, number, '5'))
                    resultArray?.add(createNewString(index, number, '7'))
                }
                '5' -> {
                    resultArray?.add(createNewString(index, number, '2'))
                    resultArray?.add(createNewString(index, number, '4'))
                    resultArray?.add(createNewString(index, number, '6'))
                    resultArray?.add(createNewString(index, number, '8'))
                }
                '6' -> {
                    resultArray?.add(createNewString(index, number, '3'))
                    resultArray?.add(createNewString(index, number, '5'))
                    resultArray?.add(createNewString(index, number, '9'))
                }
                '7' -> {
                    resultArray?.add(createNewString(index, number, '4'))
                    resultArray?.add(createNewString(index, number, '8'))
                }
                '8' -> {
                    resultArray?.add(createNewString(index, number, '7'))
                    resultArray?.add(createNewString(index, number, '9'))
                    resultArray?.add(createNewString(index, number, '0'))
                    resultArray?.add(createNewString(index, number, '5'))
                }
                '9' -> {
                    resultArray?.add(createNewString(index, number, '8'))
                    resultArray?.add(createNewString(index, number, '6'))
                }
                '0' -> resultArray?.add(createNewString(index, number, '8'))
                else -> return null
            }
        }

        return resultArray?.toTypedArray()
    }


    fun createNewString(index: Int, number: String, char: Char): String {
        var resultString = ""

        return when(index) {
            0 -> char.toString() + number.substring(index + 1..number.length - 1)
            in 1..number.length -> number.substring(0..index - 1) +
                    char.toString() +
                    number.substring(index + 1..number.length - 1)
            else -> number.substring(index..number.length - 1) + char.toString()
        }
    }
}
