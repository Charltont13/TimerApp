package com.example.a3200midterm

import com.example.a3200midterm.timers.LeftScreenViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.flow.first
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class LeftScreenViewModelTest {

    private lateinit var viewModel: LeftScreenViewModel

    @Before
    fun setup() {
        viewModel = LeftScreenViewModel()
    }

    @Test
    fun `initial seconds value is zero`() = runTest {
        val seconds = viewModel.seconds.first()
        assertEquals(0, seconds)
    }

    @Test
    fun `seconds value is incremented after startTimer`() = runTest {
        viewModel.startTimer()
        advanceTimeBy(1000) // Advance coroutine time by 1 second
        val seconds = viewModel.seconds.first()
        assertEquals(1, seconds)
    }

    @Test
    fun `seconds value is reset after resetTimer`() = runTest {
        viewModel.startTimer()
        advanceTimeBy(3000)
        viewModel.resetTimer()
        val seconds = viewModel.seconds.first()
        assertEquals(0, seconds)
    }

    private fun advanceTimeBy(i: Int) {

    }
}
