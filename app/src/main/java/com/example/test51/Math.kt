package com.example.test51

import androidx.core.text.isDigitsOnly

class Math {

    fun add(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger()) {
            result = (a.toInt() + b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
//            result = (a.toDouble() + b.toDouble()).toString()
            result = "Вы должны ввести целые числа"
        } else {
            result = "Вы должны ввести числа"
        }

        return result
    }


        fun divide(a: String, b: String): String {
            var result = ""

            if (a.isInteger() && b.isInteger() && b!="0") {
                 result = (a.toDouble() / b.toDouble()).toString()
            } else if (a.contains(".") || b.contains(".")) {
//            result = (a.toDouble() + b.toDouble()).toString()
                result = "Вы должны ввести целые числа"
            } else if (b == "0") {
                result = "На нуль делить нельзя"
            } else {
                result = "Вы должны ввести числа"
            }

            return result
    }
    fun String.isInteger() = this.toIntOrNull()?.let { true } ?: false
}
