package com.example.a3200midterm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.a3200midterm.ui.theme._3200MidtermTheme // Import the theme composable
import com.example.a3200midterm.timers.LeftScreenViewModel
import com.example.a3200midterm.timers.RightScreenViewModel

class MainActivity : ComponentActivity() {

    private val leftViewModel: LeftScreenViewModel by viewModels()
    private val rightViewModel: RightScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            _3200MidtermTheme {
                Navigation(leftViewModel, rightViewModel)
            }
        }
    }
}
