package ua.com.kaellah.codding.tasks.leetcode.easy

fun main() {
    miniMaxSum(arrayOf(942381765, 627450398, 954173620, 583762094, 236817490))
    miniMaxSum2(arrayOf(942381765, 627450398, 954173620, 583762094, 236817490))
}

fun miniMaxSum(arr: Array<Int>) {
    var min = Long.MAX_VALUE
    var max = Long.MIN_VALUE
    for (index in 0..arr.lastIndex) {
        var sum = 0L
        for (y in 0..arr.lastIndex) {
            if (y != index) {
                sum += arr[y].toLong()
            }
        }
        if (sum < min) {
            min = sum
        }
        if (sum > max) {
            max = sum
        }
    }
    println("$min $max")
}

fun miniMaxSum2(arr: Array<Long>) {
    val setTotal = arr.sum()
    var minn: Long = setTotal
    var maxx: Long = 0
    arr.forEach { i : Long ->
        val setPartSum = setTotal - i
        if(setPartSum > maxx) maxx = setPartSum
        if(setPartSum < minn) minn = setPartSum
    }
    println("$minn $maxx")
}