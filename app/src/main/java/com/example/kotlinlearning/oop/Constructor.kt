package com.example.kotlinlearning.oop

fun main(args : Array<String>){

    var p = Person("Işıl",26)
    var p2 = Person("sevgi")
    var p3=Person(age=24)
    p.age =25
    var yas = p.age

    var user = User("abdullah", 30)



}

/*
class Person {
    var name : String? = null
    var age : Int? = null
    //constructor tanımlama
    constructor(name : String , age : Int){
        this.name = name
        this.age = age
    }
//constructor tanımlama
class Person(name: String, age: Int) {
    var name : String? = name
    var age : Int? = age

}

}
 */



class Person(var name : String? = null , var age : Int?= null){

    //nesne türetildiğinde bazı işlemlerin yapılmasını isteriz.
    //Burdaki init metoduyka bu işlemleri yapmaktayız.


}

class User(firstName : String , userAge : Int){
    var name : String ? = null
    var age : Int? = null
    init {
        name = firstName.capitalize()
        age = userAge

        println("First Name : $name")
        println("Age: $age")
    }

}