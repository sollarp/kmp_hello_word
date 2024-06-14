package com.envitia.kmphelloword

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform