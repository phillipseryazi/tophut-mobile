package com.mudhut.tophut

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform