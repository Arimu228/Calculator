package com.example.calculator

class Math {
    private var result = ""
    fun add(a: String, b: String): String {

        if (a.isNotBlank() && a.isNotEmpty() && b != "" && b.isNotEmpty()) {
            if (a == b) {
            } else {
                result = "Enter Number "
            }
            return (a.toInt() + b.toInt()).toString()
        }
        return result

    }

    fun divide(a: Double, b: Double): Double {

        if (b == 0.0 && a == 0.0) {
            try {
                b / a
            } catch (e: ArithmeticException) {
                result = "you cant divide zero"
                throw e
            }
        }
        return b / a
    }
    fun increase(a: String, b: String): String {
        result = if (a.isNotBlank() && a.isNotEmpty() && b != "" && b.isNotEmpty()) {
            if (a.isNumeric() && b.isNumeric()) {
                (a.toInt() * b.toInt()).toString()
            } else "Enter numbers"
        } else "Enter numbers"
        return result
    }

    fun minus(a: String, b: String): String {
        result = if (a.isNotBlank() && a.isNotEmpty() && b != "" && b.isNotEmpty()) {
            if (a.isNumeric() && b.isNumeric()) {
                (b.toInt() - a.toInt()).toString()
            } else "Enter numbers"
        } else "Enter numbers"
        return result
    }

    fun percent(a: Double, b: Double): Double {
        val c = 100
        return (a / c) * b
    }

    private fun String.isNumeric(): Boolean {
        return this.matches("-?\\d+(\\.\\d+)?".toRegex())
    }
}

