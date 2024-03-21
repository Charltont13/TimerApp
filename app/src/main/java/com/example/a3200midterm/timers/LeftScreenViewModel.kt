package com.example.a3200midterm.timers

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.*

class LeftScreenViewModel : ViewModel() {

    // Backing property to avoid exposing MutableLiveData
    private val _seconds = MutableStateFlow(0)

    // The UI collects from this StateFlow to get its state updates
    val seconds: StateFlow<Int> = _seconds.asStateFlow()

    // Use this scope for coroutines, which will be canceled when ViewModel is cleared
    private val viewModelScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    fun startTimer() {
        // Implementation for starting the timer
        viewModelScope.launch {
            while (isActive) {
                delay(1000)
                _seconds.value += 1
            }
        }
    }

    fun pauseTimer() {
        // Implementation for pausing the timer
        viewModelScope.cancel()
    }

    fun resetTimer() {
        // Implementation for resetting the timer
        _seconds.value = 0
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel() // Cancel coroutines when the ViewModel is about to be destroyed
    }
}
