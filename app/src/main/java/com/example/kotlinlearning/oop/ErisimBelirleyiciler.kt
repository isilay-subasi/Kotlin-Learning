package com.example.kotlinlearning.oop

/*
    public  : Herkese açık. Tüm sınıflar erişebilir.
    private : Sadece kendi sınıfından erişim sağlanabilir.
    protected : Kendi sınıfı ve alt sınıflarından erişebilir.
    internal : Sadece kendi modülünden erişim sağlanır.
 */
fun main(args : Array<String>){


}

class PublicClass{
    val i = 1 ;
    fun func(){
        var pc = PrivateClass()
        //pc.a erişim sağlanmaz
        //pc.privatefunc() erişim sağlanmaz
    }

}

private class PrivateClass{
    private val a= 9
    private fun privatefunc(){

    }

}

open class A{

    protected  val b = 2

}

class B : A() {
    fun getMethod() = b
}

internal class InternalClass{

    var i = 5
}
