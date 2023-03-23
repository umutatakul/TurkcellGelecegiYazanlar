package com.umutatakul.constructor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Primary
        //var t = Test()
        var t = Test("Ali",10)
        //Secondary
        var t2 = Test2("",20)
        var t3 = Test2(23,"Umut")
        var t4 = Test2(25) // constructor'da  string'e ="" ile başlangıç değeri verdiğimiz için
        //Kabul etti

    }

}

class Test(val isim : String, var yas : Int){
    /*var isim : String
    var yas : Int

     */
    init {
        println(isim)
    }
}

class Test2(var isim: String,var yas: Int,var adres: String){
    /*var isim : String
    var yas : Int
    var adres : String
         */
    constructor(yas: Int , adres : String = ""):this("",yas,adres){
        /*this.isim = ""
        this.yas = yas
        this.adres = adres

         */
    }
    constructor( isim: String,yas: Int):this(isim,yas,""){
        /*this.isim = isim
        this.yas = yas
        adres = ""

         */
    }
}

