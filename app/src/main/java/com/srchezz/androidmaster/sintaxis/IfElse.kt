package com.srchezz.androidmaster.sintaxis

fun main() {
    ifBasico();
}

fun ifMultipleOR() {

    var pet = "dog"
    if(pet == "dog" || pet == "cat"){
        print("Es un perro on un gato")
    }
}

fun ifMultiple() {
    var age = 18
    var parentPermission = false

    if (age >= 18 && parentPermission){
        println("somos el esitos")
    }
}

fun ifBasico() {
    val name = "Aris"

    if(name.toLowerCase() == "aris") {
        println("Bye, la variable name es ARIS")
    } else {
        println("Todo mal, todo mal")
    }
}

fun ifAnidado() {
    val animal = "dog";
    if (animal == "dog") {
        println("Es un perrito!")
    } else if (animal == "cat"){
        println("Es un gato")
    } else {
        println("No es uno de los animales esperados")
    }
}

fun ifInt() {
    var age = 29

    if (age > 18) {
        println("Beber vinito")
    } else {
        println("Beber un juguito")
    }
}

fun ifBoolean() {
    var soyFeliz:Boolean = false

    if(!soyFeliz){
        print("Estoy triste :(")
    }
}