package org.kolokolov.collections

fun main(args: Array<String>) {
    listOf("One", "Two", "Three", "Four", "Five")
            .filter { it.startsWith("T") }
            .map { it.length }
            .takeLast(1)
            .forEach { println(it) }

    println(getSum(1,2,3,4,5))

    val foldedSum = arrayOf(1,2,3,4,5).fold(0) { acc, i -> acc + i}

    println(foldedSum)

    println("aaabbc".groupBy {it}.map {it.value.size.toString() + it.key }.reduce(String::plus))
}


fun getSum(vararg nums: Int): Int = nums.reduce { acc, i -> acc + i }