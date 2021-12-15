package com.example.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    companion object {
        //var TAG: String? = null
        var sayi : Int =5
        var sayi2 : Int =7
        var sonuc : Int=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var button : Button





        sonuc=sayi+sayi2
        button=findViewById(R.id.button)
        button.setOnClickListener(listener)

        /*
               button.setOnClickListener(){

                              Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()

                   val toast = Toast.makeText(applicationContext, "Hello Javatpoint", Toast.LENGTH_SHORT)
                   toast.show()




            val myToast = Toast.makeText(applicationContext,"toast message with gravity",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.LEFT,200,200)
            myToast.show()
        }
       */
        /*


            println("hello kotlin")
            println(4*5)

            var x=5
            var y=6
            println(x*y)

            //constanst(değiştirilemez)
            val name="isil"

            //Defining
            var a : Int

            //Initialize
            a=67

            //Defining && Initialize
            var b : Int =90

            //Double && Float

            val pi=3.14
            println(pi*2)

            val myFloat=3.45f
            println(myFloat*2)
            */


       println(myClass.info)
        println(myClass.getMoreInfo())

        var variables = Variables(this)
        variables.name = "sevgi"




    }


    val listener = View.OnClickListener { view ->
        when (view.getId()) {
            R.id.button -> {
                // Do some work here
                Toast.makeText(applicationContext,"$sonuc ",Toast.LENGTH_SHORT).show()
            }
        } }

    class myClass{
        companion object{
            val info = "This is info"
            fun getMoreInfo() : String{
                return "This is more info"
            }
        }

    }



}