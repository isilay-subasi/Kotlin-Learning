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

    HelloWorld()
    HelloWorld2()
    messageYaz("Heyyoo")
    var mesaj = getMessage()
    println(mesaj)
    var fullName = getHepsi("isil","subasi")
    println(fullName)

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

fun HelloWorld(){
    println("Hello World")
}

fun HelloWorld2()= println("Hello World 2")

fun messageYaz(message : String){
    println("Mesajınız : $message")
}

fun getMessage() : String{
    return  "Welcome"
}

fun getMesaagesTekSatir() : String = "welcome"

fun getHepsi(name : String , lastName : String) : String = "Adınızı : $name Soyadınız : $lastName"

// Eğer kotlinde geriye bir değer döndürmeyen fonksiyon oluşturursak bu unit tipinde döndürür.
//Diğer programlama dilinde bu voide karşılık gelmektedir.
fun myFunc() : Unit = println("Fonksiyon Çalıştı")