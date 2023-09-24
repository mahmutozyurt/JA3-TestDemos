package com.mtoz147.testdemo


import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax:Tax
@Before // is the place where tasks to be performed before a test starts are defined.
fun setup(){
    tax=Tax()
}
    @After //is the place where tasks to be performed after a test finishes are defined.
fun teardown(){
    //This example is not applicable to the application.
}

    @Test
    // fun `sssssss`(){} You can write the desired function name between the backticks (``).
    fun calculateTaxTest(){
        //val tax=Tax()
        val netTax=tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10.0)
    }

    @Test
    fun calculateIncomeTest(){
        //val tax=Tax()
        val netIncome=tax.calculateIncome(100.0,0.1)
        assertThat(netIncome).isEqualTo(90)

    }
}