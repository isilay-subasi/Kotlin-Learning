package com.example.kotlinlearning.oop

fun main(args : Array<String>){

    var example = Exampple()
    example.name = "Sevgi"
    var isim = example.name


    var user1 = Users()
    user1.actualAge = 15
    user1.age = 15
    println("User1 actual age : ${user1.actualAge}" )
    println("User1 age : ${user1.age}" )

    var user2 = Users()
    user2.actualAge=35
    user2.age = 35
    println("User2 actual age : ${user2.actualAge}" )
    println("User2 age : ${user2.age}" )



}

class Exampple{

    var name : String = "Isil"
    get() = field
    set(value) {
        field = value
    }
}

class Users{
    var age : Int = 0
    get() = field
    set(value) {
        field = if(value < 18)
            18
        else if (value >= 18 && value <= 30)
            value
            else
                value -3

    }

    var actualAge : Int = 0


}