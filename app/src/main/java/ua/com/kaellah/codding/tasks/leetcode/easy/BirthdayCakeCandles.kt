package ua.com.kaellah.codding.tasks.leetcode.easy


fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.max()
    var count = 0
    candles.forEach { candle ->
        if (candle == max) {
            count++
        }
    }
    return count
}
