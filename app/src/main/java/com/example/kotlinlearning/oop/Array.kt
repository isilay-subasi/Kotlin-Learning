package com.example.kotlinlearning.oop

/*
    Array : mutable

    Collections
    Immutable (Read only) (Sabit)
            1.Immutable List -> listOf
            2.Immutable Map -> mapOf
            1.Immutable Set -> setOf
    Immutable (Read and write) (Dinamik)
            1.Mutable List -> ArrayList , arrayListOf , mutableListOf
            2.Mutable Map -> HashMap , hashmapOf , mutableMapOf
            1.Mutable Set -> mutableSetOf , hashSetOf

 */

fun main(args : Array<String>){
    /*
    Array
     */
    var array1=Array<Int>(5){0}
    var array2 = arrayOf(1,2,3)
    array2[0]=5
    for (items in array2) println(items)

    /*
    List
     Immutable sabit , elemanını değiştirmeye çalışırsak hata verecektir.
     */
    var list = listOf<String>("Kotlin","java","ruby","java","C++")
    for(item in list) println(item)
    for (item in 0..list.size-1) println(list[item])

    /*
    ArrayList
    Mutable
     */
    var arrayList= mutableListOf<String>("Kotlin","java","ruby","java","C++")
    arrayList[2] = "Isilay"
    arrayList.removeAt(4)
    println(arrayList)
    for (item in arrayList) println(item)


}

