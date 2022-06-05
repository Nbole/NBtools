package com.example.nbtoolslibrary

import android.util.Log

fun <T> getTime(action: () -> T, message: String): T {
    val currentTime = System.currentTimeMillis()
    val r = action.invoke()
    Log.d("CalculateTime", "${(System.currentTimeMillis()) - currentTime}")
    return r
}
