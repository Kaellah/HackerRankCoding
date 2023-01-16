package ua.com.kaellah.codding.tasks.leetcode.easy

fun main() {
    fizzBuzz(15)
}

private const val Fizz = "Fizz"
private const val Buzz = "Buzz"
private const val FizzBuzz = Fizz + Buzz

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (index in 1..n) {
        when {
            index.isDivisible(3) && index.isDivisible(5) -> result.add(FizzBuzz)
            index.isDivisible(3) -> result.add(Fizz)
            index.isDivisible(5) -> result.add(Buzz)
            else -> result.add("$index")
        }
    }
    println(result)
    return result
}

fun Int.isDivisible(divisor: Int) = this % divisor == 0