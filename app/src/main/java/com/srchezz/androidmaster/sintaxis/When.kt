package com.srchezz.androidmaster.sintaxis

fun main() {
    getMonth(7)
}

fun result(value: Any){
    when(value) {
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print ("hello")
    }
}


fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("El mes no existe")
    }
}

fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("El trimestre no es valido")
    }
}

fun getSemester(month: Int):String {
    return when (month) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        else -> "El semestre no es válido"
    }
}