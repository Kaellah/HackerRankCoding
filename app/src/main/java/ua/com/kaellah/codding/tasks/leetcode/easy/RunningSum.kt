package ua.com.kaellah.codding.tasks.leetcode.easy


fun runningSum(nums: IntArray): IntArray {
    var i = 1
    while (i < nums.size) {
        nums[i] += nums[i - 1]
        i++
    }
    return nums
}