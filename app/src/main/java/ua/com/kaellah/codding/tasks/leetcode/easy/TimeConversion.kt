package ua.com.kaellah.codding.tasks.leetcode.easy


fun main() {
    println(timeConversion("07:05:45PM"))
    println(timeConversion("12:40:22AM"))
    println(timeConversion("12:45:54PM"))
}

fun timeConversion(s: String): String {
    val time = s.substring(0, s.length - 2)
    val timeFormat = s.substring(s.length - 2, s.length)
    val hours = time.substring(0, 2).toInt()
    val minutesSeconds = time.substring(2, time.length)
    return if (timeFormat == "PM") {
        if (hours + 12 == 24) {
            "12$minutesSeconds"
        } else {
            "${hours + 12}$minutesSeconds"
        }
    } else {
        if (hours == 12) {
            "00$minutesSeconds"
        } else {
            time
        }
    }
}