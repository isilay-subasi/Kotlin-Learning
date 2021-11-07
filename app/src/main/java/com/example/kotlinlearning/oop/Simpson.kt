package com.example.kotlinlearning.oop

class Simpson(var inputSayi : Int , var inputSayi2 : Int) {




    /*

    var sayi = 0
    private var sayi2 = 3
    constructor(input1 : Int , input2 : Int ){
        this.sayi=input1
        this.sayi2=input2
    }

        fun getSayi2(){

    }
    */





}

fun main(args : Array<String>){

    var simpson = Simpson(5,7)
    /*

    simpson.sayi
    simpson.getSayi2()
     */

    //Nullability- Null olabilme
    /*
    Başlangıçta olduşturduğum değişkene değer ataması yapmazsam eğer hata verir.
    Bunun için null değerini atayıp başlangıçta hiç bir değer ataması yapmayabiliriz.

    //Nullable(?) && Non-null
    // !! myAge'in değeri kesinlikle orda demektir.
    // if ile bunu kontrol etmeliyiz. buna NullSafety denir.
    // NullSafety - Null Güvenirliliği
    //Soru işareti bu değer var mı yok mu bilmiyorum demektir.


     */

    var myString : String? = null // Bu artık nullable Stringtir.
    var myAge : Int? = null

    //1.yöntem -Null Safety
    if(myAge != null){
        println(myAge * 10)
    }else{
        println("myAge null")
    }

    //2.yöntem -Safe Call
    println(myAge?.compareTo(2))

    //3.yöntem - Elvis
    //Eğer null dönerse -100 ekrana yazdırılsın anlamında güvenliği sağlayacaktır.
    val myResult = myAge?.compareTo(2) ?: -100
    println(myResult)


}