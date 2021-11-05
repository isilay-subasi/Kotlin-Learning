package com.example.kotlinlearning.oop

fun main(args: Array<String>){
    //Extension Functions
    //var sonuc = triple(3)
    //println(sonuc)
    5.triple()
    10.triple()
    println(15.triple())
    println("kotlin".reversed())

    var list = arrayListOf("Kotlin", "C" , "Java", "Python")

    for(item in list) println(item)
    list.swap(0,3)
    for(item in list) println(item)


}

//fun triple(sayi : Int) : Int =sayi*3
fun Int.triple() = this*3

fun ArrayList<String>.swap(x : Int , y : Int){
    val temp =this[x]
    this[x] = this[y]
    this[y] = temp

}