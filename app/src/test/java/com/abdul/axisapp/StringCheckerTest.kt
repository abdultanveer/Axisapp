package com.abdul.axisapp

import android.text.TextUtils
import io.mockk.*
import org.junit.Before
import org.junit.Test

class StringCheckerTest {
     lateinit var stringChecker : StringChecker

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        mockkStatic(TextUtils::class)
        val result = ExampleObject.add(10,20)
    }

    @Test
    fun testAdd(){
        mockkObject(ExampleObject)
        every { ExampleObject.add(10,20)} returns 9
        val result = ExampleObject.add(10,20)

    }



    @Test
    fun stringChecker_Is_Empty() {
        //given
        stringChecker  = mockk< StringChecker >()
        every {
            stringChecker.isTextEmpty("test")
            //TextUtils.isEmpty(any())
        } returns false
        // stubb the call to method
        //when
        val result: Boolean = stringChecker. isTextEmpty("test")
        //then
       // assert(result,  true )
        assert(result, { true })
    }
}