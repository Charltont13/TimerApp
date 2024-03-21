package com.example.a3200midterm.screens
import com.example.a3200midterm.screens.TimerScreen
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.a3200midterm.timers.LeftScreenViewModel

@Composable
fun LeftScreen(viewModel: LeftScreenViewModel = viewModel()) {
    val seconds by viewModel.seconds.collectAsState()
    TimerScreen(
        name = "Left",
        seconds = seconds,
        startTimer = viewModel::startTimer,
        pauseTimer = viewModel::pauseTimer,
        resetTimer = viewModel::resetTimer
    )

}

