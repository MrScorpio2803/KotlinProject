package org.example

fun formatValue(value: Int): String {
    return "%02d".format(value)
}

fun main() {
    val rawSeconds = readln().toInt()

    val hours = rawSeconds / 3600
    val minutes = (rawSeconds % 3600) / 60
    val seconds = (rawSeconds % 3600) % 60
    val formatHours = formatValue(hours)
    val formatMinutes = formatValue(minutes)
    val formatSeconds = formatValue(seconds)

    println("$formatHours:$formatMinutes:$formatSeconds")
}