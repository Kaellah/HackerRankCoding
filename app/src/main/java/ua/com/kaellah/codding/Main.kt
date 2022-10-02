package ua.com.kaellah.codding

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.abs

fun main(args: Array<String>) {
    val arr = arrayOf(-4, 3, -9, 0, 4, 1)
    plusMinus(arr)
}





private fun plusMinus(arr: Array<Int>): Unit {
    var positive = 0.0
    var negative = 0.0
    var zero = 0.0
    for (index in arr.indices) {
        when {
            arr[index] == 0 -> zero++
            arr[index] > 0 -> positive++
            else -> negative++
        }
    }
    val df = DecimalFormat("#,#####0.00000")
    df.roundingMode = RoundingMode.CEILING

    val p: Double = positive / arr.size
    val n: Double = negative / arr.size
    val z: Double = zero / arr.size

    println(df.format(p))
    println(df.format(n))
    println(df.format(z))
}