package com.example.assignment1

import org.junit.Assert.assertEquals
import org.junit.Test

class AgeComparisonTest {

    @Test
    fun validAgeComparisonTest() {
        val age = 35
        val expectedHistoricalFigure = "Mozart (Age 35)"
        val result = compareAgeWithFigures(age) //  returns a String
        assertEquals(expectedHistoricalFigure, result) // No type mismatch

}

    private fun compareAgeWithFigures(age: Int) {

    }

    @Test
    fun invalidAgeTest() {
        val age = 105
        val expectedMessage = "Please enter an age between 20 and 100."
        val result = compareAgeWithFigures(age)
        assertEquals(expectedMessage, result)
    }
}
