package com.example.a3200midterm.timers

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainScreenViewModel : ViewModel() {

    private val _seconds = MutableStateFlow(0)
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
