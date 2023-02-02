package ua.com.kaellah.codding.tasks.leetcode.easy

import java.util.*

fun main() {
    println(containsDuplicateHash(intArrayOf(1,2,3,4)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val duplicates = mutableMapOf<Int, Int>()
    for (num in nums) {
        val cur = duplicates[num] ?: 0
        duplicates[num] = cur + 1
    }
    duplicates.keys.forEach { key ->
        val value = duplicates[key] ?: 0
        if (value > 1) {
            return true
        }
    }
    return false
}

fun containsDuplicateSort(nums: IntArray): Boolean {
    Arrays.sort(nums)
    for (index in 1..nums.lastIndex) {
        if (nums[index] == nums[index - 1]) {
            return true
        }
    }
    return false
}

fun containsDuplicateHash(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (num in nums) {
        if (set.contains(num)) {
            return true
        }
        set.add(num)
    }
    return false
}