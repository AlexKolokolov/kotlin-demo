package org.kolokolov.recursion

import java.math.BigInteger

fun main(args: Array<String>) {
    fun fact(n: Int): BigInteger = if (n <= 1) BigInteger.ONE else fact(n - 1).multiply(n.toBigInteger())

    fun fact2(n: Int): BigInteger {
        return if (n <= 1)  BigInteger.ONE
        else fact2(n - 1).multiply(n.toBigInteger())
    }

    tailrec fun tailFact(n: Int, acc: BigInteger = BigInteger.ONE): BigInteger {
        if (n <= 0) return acc
        return tailFact(n - 1, acc.multiply(n.toBigInteger()))
    }

    val fact10 = fact(10)
    val fact6 = fact2(6)
    val fact5 = tailFact(5)

    println(fact10)
    println(fact6)
    println(fact5)
}