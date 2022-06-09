package com.example.nbtoolslibrary

import android.util.Log

/**
 * Estimate time in milliseconds and show in Log, [tag] and [message] are optionals Strings you
 * can use to see the result in your log.
 */
fun <T> getMilliseconds(
    tag: String? = "EstimatedTime",
    message: String? = "value:",
    action: () -> T
): T {
    val currentTime = System.currentTimeMillis()
    val returnValue = action.invoke()
    Log.d(tag, "$message ${(System.currentTimeMillis()) - currentTime}")
    return returnValue
}
