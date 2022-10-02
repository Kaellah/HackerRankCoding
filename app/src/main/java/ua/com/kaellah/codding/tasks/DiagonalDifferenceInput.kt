package ua.com.kaellah.codding.tasks

import kotlin.math.abs


fun diagonalDifferenceInput() {
    val even = arrayOf(11, 2, 4)
    val odd = arrayOf(4, 5, 6)
    val last = arrayOf(10, 8, -12)
    val matrix: Array<Array<Int>> = arrayOf(even, odd, last)
    print(diagonalDifference(matrix))
}

private fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var diagonalLeft = 0
    var diagonalRight = 0
    for (index in arr.indices) {
        diagonalLeft += arr[index][index]
        diagonalRight += arr[index][arr[index].size - index - 1]
    }
    return abs(diagonalLeft - diagonalRight)
}