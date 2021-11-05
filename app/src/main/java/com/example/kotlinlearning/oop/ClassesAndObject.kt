package com.example.kotlinlearning.oop

class ClassName{
    //property
    //methods
}

fun main(args: Array<String>){
    var lamp= Lamp()
    lamp.isOn = true
    lamp.turnOf()
    lamp.turnOn()

    var lamp2 = Lamp()
    lamp2.turnOn()

    var araba = Araba()
    araba.model = 2017
    araba.renk = "Beyaz"
    araba.calisma()
    araba.hizlanma()




}


class Lamp{
    var isOn : Boolean =false

    fun turnOn(){
        isOn =true
    }

    fun turnOf() {
        isOn = false
    }
}