package com.srchezz.androidmaster.sintaxis


fun main() {

    // Int
    val age1: Int = 31;
    var age2: Int = 32;
    age2 = 2;

    showMyAge(age1)
    add(age1, age2)
    val mySubstract = substractCool(age1, age2)
    println(mySubstract)

}

fun showMyAge(curretnAge: Int) {
    println("Tengo $curretnAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println("Sumar: ")
    println(firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int):Int {
    println("Restar: ")
//    println(firstNumber - secondNumber)
    return firstNumber - secondNumber
}

fun substractCool(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber;

