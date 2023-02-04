package ua.com.kaellah.codding.tasks.leetcode.medium

import java.util.Arrays


fun main() {
//    println(productExceptSelf().contentToString())
}

fun productExceptSelf(nums: IntArray, k: Int): IntArray {
    val products = intArrayOf()

    val map = mutableMapOf<Int, Int>()
    val sortedVals = map.values.toIntArray()
    Arrays.sort(sortedVals)
    val result = sortedVals.copyOfRange(k, sortedVals.lastIndex)

    return products
}