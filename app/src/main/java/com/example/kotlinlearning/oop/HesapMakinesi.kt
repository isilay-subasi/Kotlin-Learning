package com.example.kotlinlearning.oop

fun main(args : Array<String>){

    var sonuc = topla(4,5)
    println(sonuc)

    var sonuc1 = hesapla(5,6,"*")
    println(sonuc1)
}

fun topla(sayi1 : Int , sayi2 : Int) : Int{
    return sayi1 + sayi2
}

fun cikarma(sayi1 : Int , sayi2 : Int) :Int = sayi1 - sayi2
fun bölme(sayi1 : Int , sayi2 : Int) :Int = sayi1 / sayi2
fun carpma(sayi1 : Int , sayi2 : Int) :Int = sayi1 * sayi2


fun hesapla(sayi1 : Int , sayi2 : Int , islem : String) : Int = when(islem){
    "+" -> sayi1 + sayi2
    "-" -> sayi1 - sayi2
    "*" -> sayi1 * sayi2
    "/" -> sayi1 / sayi2
    else -> 0


}