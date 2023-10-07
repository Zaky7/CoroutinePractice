package com.coroutine.practice

import java.math.BigDecimal


class SequenceGenerator {

    fun generateIntSequence() = sequence {
        println("Generating first line")
        yield(1)
        yield(2)
        yield(3)
    }


    fun generateFibonacciNumber() = sequence {
        var first = "0".toBigDecimal()
        var second = "1".toBigDecimal()

        while (true) {
            yield(first)
            val temp = first
            first += second
            second = temp
        }
    }
}


fun main() {

    val sequenceGenerator = SequenceGenerator()
    val fibonacciGenerator = sequenceGenerator.generateFibonacciNumber()


    println("Ten fibonacci numbers are below")
    println(fibonacciGenerator.take(10).toList())


}