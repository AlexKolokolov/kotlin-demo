package org.kolokolov

import java.util.*

fun main(args: Array<String>) {
    val list1 = ArrayList<Int>()
    list1.add(1)
    list1.add(2)
    list1.add(3)
    val list2 = list1.map {
        e -> e * 2
    }.filter {
        e -> e >= 3
    }
    println(list2)

    val a: Optional<Int> = Optional.of(1)
    val b: Optional<Int> = Optional.of(10)
    val c: Optional<Int> = Optional.of(100)

    val optionalSum = a.flatMap { resA -> b.flatMap { resB -> c.map { resC -> resA + resB + resC } } }

    println(optionalSum)
}