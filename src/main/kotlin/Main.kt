package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val year: String = "1961"
    var hours: String = "09"
    var minutes: String = "07"

    println(year)
    println(hours)
    println(minutes)

    hours = "10"
    minutes =  "55"

    // Способ вывести часы и минуты в одну строку №1
    print(hours)
    print(':')
    print(minutes)

    // Способ вывести часы и минуты в одну строку №2
    println("$hours:$minutes")
}