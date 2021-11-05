package com.example.kotlinlearning.oop

/*
    1.Bütün infix fonksyionlar extension fonksiyondur.
    Ancak bütün extension fonksiyonlar infix fonksiyon değildir.
    2.Infix fonksiyonlar tek parametre alır.

 */

fun main(args : Array<String>){

    //downto - > 5ten 1 e kadar saymak için kullanılır.
    5 downTo 1 // Infix functions
    5.downTo(1)

   var sonucinfix = 4 toplainfix 6
    println(sonucinfix)
    4.toplainfix(7)

    println("Kotlin".concat("other"))
}

infix fun Int.toplainfix(sayi : Int) :Int =this+sayi

infix fun String.concat(other : String) : String =this + other