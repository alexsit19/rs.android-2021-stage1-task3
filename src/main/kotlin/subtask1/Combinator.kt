package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var result: Int? = null
        val n = array[1]
        val m = array[0]

        for (k in 1..n) {
            val c = factorial(n) / (factorial(k) * factorial(n - k))
            if (c.toInt() == m) {
                result = k
                break
            }
        }
        return result
    }

    fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n-1)
}
