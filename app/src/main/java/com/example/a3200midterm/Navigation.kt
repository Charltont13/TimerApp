package com.example.a3200midterm

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a3200midterm.screens.MainScreen
import com.example.a3200midterm.screens.LeftScreen
import com.example.a3200midterm.screens.RightScreen
import com.example.a3200midterm.screens.ScreenRoutes
import com.example.a3200midterm.timers.LeftScreenViewModel
import com.example.a3200midterm.timers.MainScreenViewModel
import com.example.a3200midterm.timers.RightScreenViewModel

@Composable
fun Navigation(leftScreenViewModel: LeftScreenViewModel, rightScreenViewModel: RightScreenViewModel, mainViewModel: MainScreenViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ScreenRoutes.MainScreen.route) {
        composable(route = ScreenRoutes.MainScreen.route) {
            MainScreen(navController = navController, viewModel = mainViewModel)
        }
        composable(route = ScreenRoutes.LeftScreen.route) {

            LeftScreen(viewModel = leftScreenViewModel)
        }
        composable(route = ScreenRoutes.RightScreen.route) {


            RightScreen(viewModel = rightScreenViewModel)
        }
    }
}
