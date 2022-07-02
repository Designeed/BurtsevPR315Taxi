package com.example.burtsevpr315taxi

import org.junit.Assert.*
import org.junit.Test

internal class ValidateTest {

    //Test for onBlank method
    @Test
    fun `onBlank method with one empty string should return true`() {
        val string1 = ""
        val string2= ""

        val result = Validate().onBlank(string1, string2)

        assertEquals(true, result)
    }

    //Test for onBlank method
    @Test
    fun `onBlank method with all empty string should return true`() {
        val string1 = ""
        val string2= "123"

        val result = Validate().onBlank(string1, string2)

        assertEquals(true, result)
    }

    //Test for onBlank method
    @Test
    fun `onBlank method with out empty string should return true`() {
        val string1 = "1"
        val string2= "123"

        val result = Validate().onBlank(string1, string2)

        assertEquals(false, result)
    }

    //Test for emailAddress method
    @Test
    fun `emailAddress method with wrong email should false`() {
        val email = "wrongEmail"

        val result = Validate().emailAddress(email)
        assertEquals(false, result)
    }

    //Test for emailAddress method
    @Test
    fun `emailAddress method with right email should true`() {
        val email = "rightEmail@gmail.com"

        val result = Validate().emailAddress(email)
        assertEquals(true, result)
    }
}
