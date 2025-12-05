package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*  Тут idea подсвечивает аннотацию типов, как неиспользуемую.
        Мне нужно продолжать указывать для каждой переменной типизацию или отталкиваться от условия?
     */
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"
    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"
    println("$hour:$minute")
}