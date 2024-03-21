package com.example.a3200midterm.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a3200midterm.screens.ScreenRoutes

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            navController.navigate(ScreenRoutes.LeftScreen.route)
        }) {
            Text("Go to LEFT Timer")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ScreenRoutes.RightScreen.route)
        }) {
            Text("Go to RIGHT Timer")
        }
    }
}
