package com.example.kotlinlearning.oop

/*
Array
 */

fun main(args : Array<String>){

    var array1=Array<Int>(5){0}
    var array2 = arrayOf(1,2,3)
    array2[0]=5
    for (items in array2) println(items)
}

