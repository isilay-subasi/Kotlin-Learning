package com.example.kotlinlearning


class NullSafety {


    fun nullSafety(){

        var tht: String? = "isil"
        tht = null
        println(tht)
        println(tht?.length)
        val sure : Int = tht?.length ?: -1
        println(sure)

    }




}