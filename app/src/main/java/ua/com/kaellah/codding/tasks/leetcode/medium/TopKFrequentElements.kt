package ua.com.kaellah.codding.tasks.leetcode.medium

import java.util.*

fun main() {
    println(topKFrequent(intArrayOf(3,0,1,0), 1).contentToString())
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    Arrays.sort(nums)
    if (nums.size == k) {
        return nums
    }
    val map = mutableMapOf<Int, Int>()
    for (num in nums) {
        if (map.containsKey(num)) {
            val curr = map[num] ?: 0
            map[num] = curr + 1
        } else {
            map[num] = 1
        }
    }

    return map
        .toList()
        .sortedBy { (_, value) -> value }
        .toMap()
        .keys
        .toList()
        .takeLast(k)
        .toIntArray()
}