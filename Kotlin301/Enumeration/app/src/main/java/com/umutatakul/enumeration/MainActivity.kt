package com.umutatakul.enumeration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var g = Gun.Cuma
        if (g==Gun.Cuma){

        }
        var hata = HataKodlari.InternetHatasi
        hata.MesajGonder()

    }
}

enum class Gun(){
    Pazartesi, Sali, Carsamba ,Persembe , Cuma , Cumartesi, Pazar

}

enum class HataKodlari(val kod : Int , val mesaj : String){
    SistemHatasi (1,"Bilinmeyen bir hata oluştu."),
    InternetHatasi(2,"Bağlantınızı kontrol ediniz");

    fun MesajGonder(){
        println(mesaj)
    }
}