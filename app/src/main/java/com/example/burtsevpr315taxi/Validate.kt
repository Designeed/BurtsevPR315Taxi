package com.example.burtsevpr315taxi

import java.util.regex.Pattern

class Validate {
    fun onBlank(vararg params: String): Boolean {
        var result = false
        params.forEach {
            if (it.isBlank()) {
                result = true
                return@forEach
            }
        }
        return result
    }

    fun emailAddress(param: String): Boolean =
        Pattern
            .matches(
            "^[A-Za-z](.*)([@])(.+)(\\.)(.+)",
            param)
}