package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number >= 5) {
            return iterate(number * number, number - 1)

        } else {
            return null
        }

    }

    private fun iterate(squareNumber : Int, nextStep : Int) : Array<Int>?{
        for (i in nextStep downTo sqrt((nextStep*nextStep/2).toDouble()).toInt() + 1) {
            val remain = squareNumber - i * i

            if(remain == 0) {
                return arrayOf(i)
            }
            else {

                val next = sqrt(remain.toDouble()).toInt()
                val nextElem = if(next < i) iterate(remain, next) else iterate(remain, i - 1)

                if (!nextElem.isNullOrEmpty()) return nextElem + arrayOf(i)
            }
        }
        return null
    }
}
