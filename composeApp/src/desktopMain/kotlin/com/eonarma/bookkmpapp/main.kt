package com.eonarma.bookkmpapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Book KMP App",
    ) {
        App()
    }
}