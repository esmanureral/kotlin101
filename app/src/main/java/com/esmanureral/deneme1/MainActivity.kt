package com.esmanureral.deneme1

import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("esmanur") //LogCat den System.out yazdıgında görebiliyorsun.
        hello()
        mySum(sayi1 = 2, sayi2 = 3)
        println(fullName(name="Cengizhan",surname="Kaya"))

        //infix
        val deger=5 mySum 6
        print(deger)

        //generic
        val numberArray= arrayOf(1,2,3,4,5)
        myArrayFun(numberArray)


        //FRUİT CLASSI OLUŞTURDUK:

//        val banana=Fruit()
//        banana.price=36
//        banana.color="yellow"
//        print(banana.price)
//        print(banana.color)


        //constructor için

        val apple=Fruit(price = 30,color="red")

        println(apple.price)
        println(apple.color)

       //SUM CLASS'I
         val page1=Sum()

        println(page1.mySum(sayi1 = 2, sayi2 = 4))

        //CAR CLASS'I
        // encapsulation için; okunsun ama değiştirilemesin
        val volvo=Car(brand = "volvo", model = 2010,color="red")
        print(volvo.color)
        //volvo.color="yellow"   private set yaptıgımız için dışarıdan erişilmiyor.

        // İnheritance (Kalıtım)
        //ANİMAL VE BİRD CLASS'I İÇİN

        var animal=Animal(foot = 2,color="Black")
        var bird=Bird(foot = 4,color="brown",)
        bird.chirp()
        print(bird.color)
    }

    fun hello(){
        println("hello")
    }
    fun mySum(sayi1:Int,sayi2:Int){
        println(sayi1+sayi2)
    }

    fun fullName(name:String,surname:String):String{
        return "name: $name - surname: $surname"
    }

    //İNFİX FONKSİYON
    // nokta ve parantez kullanımını kaldırır.
    infix fun Int.mySum(sayi:Int):Int{
        return this + sayi
    }


    //GENERİC FONKSİYON
    //kullanıcının girdiği veri tipine göre T şekil alır.
    fun <T> myArrayFun(myArray: Array<T>){
        for(i in myArray){
            println(i)
        }
    }




}