package com.srchezz.androidmaster.sintaxis

fun main () {
    var weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(weekDays[5])
    println(weekDays.size)
    println(weekDays[weekDays.size-1])

    weekDays[0] = "Lunes :)"

    // Bucles en
    for (position in weekDays.indices) {
//        println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()) {
        println("La posición $position, contiene $value")
    }

    for (weekDay in weekDays) {
        println("Hoy es $weekDay")
    }


}
