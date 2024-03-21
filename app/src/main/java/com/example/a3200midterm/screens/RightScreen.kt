package com.example.a3200midterm.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.a3200midterm.timers.RightScreenViewModel

@Composable
fun RightScreen(viewModel: RightScreenViewModel = viewModel()) {
    val seconds by viewModel.seconds.collectAsState()
    TimerScreen(
        name = "Right",
        seconds = seconds,
        startTimer = viewModel::startTimer,
        pauseTimer = viewModel::pauseTimer,
        resetTimer = viewModel::resetTimer
    )
}
