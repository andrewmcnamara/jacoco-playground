package com.madrapps.jacoco

import kotlin.math.PI

class Arithmetic {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun modulo(a: Int, b: Int): Int {
        return a % b
    }

    fun area(a: Int, b: Int): Int {
        return a * b
    }

    fun circumference(r: Int): Int {
        return PI * r.pow(2)
    }
}
