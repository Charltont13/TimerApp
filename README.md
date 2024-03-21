# A3200 Midterm Project

## Overview
This is a simple timer application built with Kotlin and Jetpack Compose for Android.

## Features
- Two independent timers
- Start, pause, and reset functionality for each timer
- Clean and simple UI using custom Material You themes

## Project Structure
- `models`: Contains data models used in the app.
- `screens`: Composable functions for each screen in the app, including `MainScreen`, `LeftScreen`, and `RightScreen`.
- `timers`: ViewModel classes for the timers.
- `ui.theme`: Theming files including colors, typography, and the theme definition.
- `MainActivity`: The main activity that hosts the navigation.
- `Navigation`: Compose navigation setup.


## Testing
Unit tests are available for ViewModel classes:
- `LeftScreenViewModelTest`: Tests for the left timer's ViewModel.
- `RightScreenViewModelTest`: Tests for the right timer's ViewModel.
