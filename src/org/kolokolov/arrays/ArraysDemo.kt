package org.kolokolov.arrays

import java.util.*

fun main(args: Array<String>) {
    val arr = arrayOf(1,2,3)

    val arr2 = arr.plus(5)

    println(Arrays.toString(arr2))

    val arr3 = Array(5, {it * it})

    println(Arrays.toString(arr3))

}