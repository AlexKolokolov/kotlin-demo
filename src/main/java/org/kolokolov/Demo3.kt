package org.kolokolov

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>) {
    fun defineType(obj: Any = 1) {
        when (obj) {
            is Char -> println("It is character")
            is Int -> println("It is integer")
            is String -> println("It is string")
            else -> println("Undefined type")
        }
    }

    defineType('A')
    defineType("AAA")
    defineType(3)
    defineType(1.2)
    defineType()
}