package ua.com.kaellah.codding.tasks.leetcode

import kotlin.math.max

private fun main() {
    maximumWealth(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 2, 1),
        )
    )
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var sum = 0
    for (x in accounts.indices) {
        var sumPerAccount = 0
        for (y in accounts[x].indices) {
            sumPerAccount += accounts[x][y]
        }
        println(sumPerAccount)
        sum = max(sum, sumPerAccount)
    }
    return sum
}