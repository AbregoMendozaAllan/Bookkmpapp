package com.eonarma.bookkmpapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform