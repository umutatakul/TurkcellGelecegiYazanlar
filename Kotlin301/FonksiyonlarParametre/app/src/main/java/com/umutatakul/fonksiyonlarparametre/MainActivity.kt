package com.umutatakul.fonksiyonlarparametre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        f1("Değer")

        f2("Değer",10)
    }
    fun f1(p1:String){

        println(p1)
    }
    fun f2 (p1: String,p2:Int){
        println(p1 + " " + p2)
    }
}