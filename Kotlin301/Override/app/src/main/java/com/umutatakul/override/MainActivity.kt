package com.umutatakul.override

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kare = Kare()
        kare.BilgileriGoster()

        var dikdortgen = Dikdortgen()
        dikdortgen.BilgileriGoster()
        dikdortgen.deneme()

    }

}
class Kare : Sekil(){

}

class Dikdortgen : Sekil (){
    override fun BilgileriGoster(){
        println("Bu bir dikdörtgendir")
    }

    override fun deneme() {
        super.deneme()
    }
}

open class Sekil{
    open fun BilgileriGoster (){
        println("Bu bir şekildir")
    }
    open fun deneme(){
        println("Deneme")
    }
}