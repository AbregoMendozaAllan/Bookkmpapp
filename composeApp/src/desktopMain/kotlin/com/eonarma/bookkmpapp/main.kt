package com.eonarma.bookkmpapp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.eonarma.bookpedia.di.initKoin
import io.ktor.client.engine.okhttp.OkHttp
import org.koin.core.context.startKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Book KMP App",
        ) {
            App()
        }
    }
}