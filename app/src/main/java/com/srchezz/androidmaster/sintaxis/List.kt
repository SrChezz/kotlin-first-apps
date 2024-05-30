package com.srchezz.androidmaster.sintaxis

fun main () {
    mutableList()
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add("myDay")
    weekDays.add(0, "Day zero")

    println(weekDays)

    if(weekDays.isEmpty()){

    } else {
        weekDays.forEach{ println(it) }
    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly.first())
    println(readOnly.last())

    println(readOnly.filter {it.contains("a")})

    readOnly.forEach {weekDay -> println(weekDay) }
}