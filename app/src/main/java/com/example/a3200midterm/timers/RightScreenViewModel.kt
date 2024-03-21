package com.example.a3200midterm.timers

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.*

class RightScreenViewModel : ViewModel() {

    private val _seconds = MutableStateFlow(0)

    // The UI collects from this StateFlow to get its state updates
    val seconds: StateFlow<Int> = _seconds.asStateFlow()

    private val viewModelScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    fun startTimer() {
        viewModelScope.launch {
            while (isActive) {
                delay(1000)
                _seconds.value += 1
            }
        }
    }

    fun pauseTimer() {
        viewModelScope.cancel()
    }

    fun resetTimer() {
        _seconds.value = 0
    }


    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}
