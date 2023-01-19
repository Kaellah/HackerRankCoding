package ua.com.kaellah.codding.tasks.leetcode.easy

fun staircase(n: Int) {
    for (index in 0 until n) {
        val sb = StringBuilder()
        for (y in 0 until n) {
            if (y >= (n - 1) - index) {
                sb.append("X")
            } else {
                sb.append(" ")
            }
        }
        println(sb.toString())
    }
}