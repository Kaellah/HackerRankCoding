package ua.com.kaellah.codding.tasks.leetcode.easy

fun main() {
    println(singleNumber(intArrayOf(2, 5, 1, 3, 4, 5, 4, 3, 2)))
}

fun singleNumber(nums: IntArray): Int {
    var xor = 0
    for (num in nums) {
        xor = xor xor num
    }
    return xor
}