package com.example.a3200midterm.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a3200midterm.screens.ScreenRoutes
import com.example.a3200midterm.timers.MainScreenViewModel


@Composable
fun MainScreen(navController: NavController, viewModel: MainScreenViewModel = viewModel()) {
    val seconds by viewModel.seconds.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TimerScreen(
            name = "Main",
            seconds = seconds,
            startTimer = viewModel::startTimer,
            pauseTimer = viewModel::pauseTimer,
            resetTimer = viewModel::resetTimer
        )
        Row(
            modifier = Modifier.fillMaxWidth(), // Fill the width of the screen
            horizontalArrangement = Arrangement.SpaceEvenly // Space the buttons evenly
        ) {
            Button(onClick = {
                navController.navigate(ScreenRoutes.LeftScreen.route)
            }) {
                Text("Go to LEFT Timer")
            }
            Button(onClick = {
                navController.navigate(ScreenRoutes.RightScreen.route)
            }) {
                Text("Go to RIGHT Timer")
            }
        }
    }
}