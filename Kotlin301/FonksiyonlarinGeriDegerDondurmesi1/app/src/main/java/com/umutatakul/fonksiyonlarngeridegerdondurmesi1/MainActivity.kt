package com.umutatakul.fonksiyonlarngeridegerdondurmesi1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gelenDeger = DegerGetir()
        println(gelenDeger)

        var toplam = Topla(13,34)
        println(toplam)

        var cokluDeger = CokluDeger()
        println(cokluDeger.first)

        var s1 = 23
        var sonuc = Karsilastir(s1,12)
        println("Küçük sayi: ${sonuc.first}")

        println("Büyük sayi: ${sonuc.second}")
    }

    fun DegerGetir():String{
        return "Fonksiyon içi değer"
    }

    fun Topla (sayi1:Int,sayi2:Int): Int {
        return sayi1 + sayi2
    }

    fun CokluDeger():Pair<String,Int>{
        return Pair("str",1)
    }

    fun Karsilastir(sayi1:Int, sayi2:Int):Pair<Int,Int>{
        if (sayi1<sayi2){
            return Pair(sayi1,sayi2)
        }

        return Pair(sayi2,sayi1)

    }
}