package ua.com.kaellah.codding.tasks

import java.math.RoundingMode
import java.text.DecimalFormat

private const val PATTERN = "#,#####0.00000"

fun plusMinus(arr: Array<Int>): Unit {
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
    val df = DecimalFormat(PATTERN)
    df.roundingMode = RoundingMode.CEILING

    val p: Double = positive / arr.size
    val n: Double = negative / arr.size
    val z: Double = zero / arr.size

    println(df.format(p))
    println(df.format(n))
    println(df.format(z))
}