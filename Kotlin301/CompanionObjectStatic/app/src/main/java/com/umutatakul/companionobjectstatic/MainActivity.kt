package com.umutatakul.companionobjectstatic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var h = Hesaplama()
        //h.karekok()
        Hesaplama.karekok()
        Hesapla2.karekok()
    }
}

class Hesaplama{
    companion object {
        var d : Int = 10
        fun karekok(){
            println("Hesapla karekök")
        }
    }
}
object Hesapla2 {
    var d : Int = 10
    fun karekok() {
        println("Hesaplama karekök ")
        println(d)
    }
}