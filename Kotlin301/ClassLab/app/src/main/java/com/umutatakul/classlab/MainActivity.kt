package com.umutatakul.classlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var k = Kare()
        k.kenar = -1f
        println(k.kenar)

        k.kenar = 110f
        println(k.kenar)

        //k.cevre = 39


         */
        Yaz()
        var k = Kare()
        k.kenar = 10F
        k.BilgileriYaz()

    }


    /*
    fun FonksiyonAdi(){

    }
     */
    fun Yaz(){
        println("Fonskiyon için")
    }
}

class Kare{
    var kenar : Float = 0.0f
    get() {
        //Eğer kenar porportiesini bir değişken olarak kullanmak istiyorsak ve bunu değer olarak
        //döndürmek istiyorsak burda özel bir ifade bulunur bu da "field" ' dır.
        return field
    }
    //set'in içine yakalayacak olduğumuz değerin ismini yazıyoruz.
    set(yeniKenar){
        if (yeniKenar>0){
            field = yeniKenar
        }
        else{
            field = 0.0f
        }
    }
    var cevre : Float = 0.0f
    get() {
        return kenar * 4
    }
    //cevre değerini okuyabilsin ama set edemesin
    private set

    fun BilgileriYaz(){
        println("Kenar uzunluğu: $kenar")
    }
}