package ua.com.kaellah.codding.tasks.leetcode.easy


fun main() {
    println(twoSum(intArrayOf(3,2,3), 5).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    if (nums.size == 1) {
        return intArrayOf(0)
    }
    if (nums.size == 2) {
        return intArrayOf(0, 1)
    }
    val map = mutableMapOf<Int, Int>()
    for (index in nums.indices) {
        map[nums[index]] = index
    }
    for (index in nums.indices) {
        val diff = target - nums[index]
        if (map.containsKey(diff) && index != map[diff]!!) {
            return intArrayOf(index, map[diff]!!)
        }
    }

    return intArrayOf()
}