package ua.com.kaellah.codding.tasks.leetcode.easy

fun numberOfSteps(num: Int): Int {
    var count = 0
    var value = num
    while (value > 0) {
        count++
        if (value % 2 == 0) {
            value /= 2
        } else {
            value -= 1
        }
    }
    return count
}