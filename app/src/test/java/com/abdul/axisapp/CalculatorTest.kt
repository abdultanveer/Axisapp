package com.abdul.axisapp

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class CalculatorTest : TestCase() {

    /*@MockK
    private lateinit var object: MyClass()*/

   /* @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true )
    }*/



    @Test
    fun testAdd() {
        var expected = 30
        var calculator = Calculator()
        var actual = calculator.add(10,20)
        assertEquals(expected,actual)
    }

    fun testSub(){
        var expected = 25
        var calculator = Calculator()
        var actual = calculator.mul(5,4)
        assertEquals(expected,actual)
    }
}