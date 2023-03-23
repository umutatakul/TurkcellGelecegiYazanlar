package com.umutatakul.fonksiyonoverload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // imza : adı, parametre sayısı ve sırası, parametre tipi
        //var toplam = Topla(intArrayOf(1,3,4,5,3,2,9))
        var toplam = Topla(1,3,4,5,3,2,9)
        println(toplam)

    }
    fun f1(){

    }
    fun f1(p1:Int){

    }
    fun f1(p1:Int,p2:String){

    }
    fun f1(p2:String,p1:Int){

    }

    fun Topla(sayi1:Int,sayi2:Int):Int{
        return sayi1 + sayi2
    }


    fun Topla(sayi1:Int,sayi2:Int,sayi3 : Int):Int{
        return sayi1 + sayi2 + sayi3
    }

    /*

    fun Topla (sayilar: IntArray) : Int {
        var toplam :  Int = 0
        for (sayi in sayilar){
            toplam += sayi
        }
        return toplam
    }

     */
    fun Topla (vararg sayilar: Int): Int {
        var toplam :  Int = 0
        for (sayi in sayilar){
            toplam += sayi
        }
        return toplam
    }
}
