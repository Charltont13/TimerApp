package com.example.a3200midterm.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme

@Composable
fun TimerScreen(
    name: String,
    seconds: Int,
    startTimer: () -> Unit,
    pauseTimer: () -> Unit,
    resetTimer: () -> Unit
) {
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val secs = seconds % 60

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "$name Timer: ${hours.toString().padStart(2, '0')}:${minutes.toString().padStart(2, '0')}:${secs.toString().padStart(2, '0')}",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Button(onClick = startTimer) {
                Text("Start")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = pauseTimer) {
                Text("Pause")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = resetTimer) {
                Text("Reset")
            }
        }
    }
}
