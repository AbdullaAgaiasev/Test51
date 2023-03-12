package com.example.test51

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAddTest() {
        assertEquals("6",math?.add("4","2"))
    }

    @Test
    fun simpleSymbolTest() {
        assertEquals("Вы должны ввести числа",math?.add("1ewioajdv","2"))
    }

    @Test
    fun simpleWithPlusTest() {
        assertEquals("4",math?.add("+2","2"))
    }

    @Test
    fun simpleWithEmptyTest() {
        assertEquals("Вы должны ввести числа",math?.add("+2",""))
    }

    @Test
    fun simpleWithNegativeTest() {
        assertEquals("0",math?.add("-2","2"))
    }

    @Test
    fun simpleWithDoubleTest() {
        assertEquals("Вы должны ввести целые числа",math?.add("2","2.0"))
    }
    @Test
    fun simpleDivide() {
        assertEquals("4",math?.divide("8","2"))
    }

    @Test
    fun simpleSymbolDivide() {
        assertEquals("Вы должны ввести числа",math?.divide("8","2edj"))
    }

    @Test
    fun simpleNotNullNumberDivide() {
        assertEquals("1.25",math?.divide("10","8"))
    }

    @Test
    fun simpleZeroDivide() {
        assertEquals("На нуль делить нельзя",math?.divide("2","0"))
    }




    @After
    fun detach() {
        math = null
    }
}