package com.example.calculator

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {
    private var math: Math? = null

    @Before
    fun before() {
        math = Math()

    }
    @Test(expected = ArithmeticException::class)
    fun divide(){math?.divide(4.0,0.0) }




    @Test
    fun add() {
        Assert.assertEquals("4", math?.add("2","2"))
    }

    @Test
    fun minus(){Assert.assertEquals("4" ,math?.minus("8","4"))}
    @Test
    fun increase(){Assert.assertEquals("10",math?.increase("5","2"))}
    @Test
    fun percent(){Assert.assertEquals(75.0,math?.percent(250.0,30.0))}

    @After
    fun after() {
        math = null
    }



}