package com.umutatakul.constructorlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personelListesi = arrayListOf<Personel>()
        var personel = Personel("Umut",null,"Atakul","12312312312",1212)
        personelListesi.add(personel)
        personel = Personel("Ammet","Yesevi","Yılmaz", "12313",13421)
        personelListesi.add(personel)

        for(p in personelListesi){
            p.bilgileriYazdir()
        }
    }
}

// Ad, ikinciAd, Soyad, kimlikNo,SicilNo, bilgileri bulunan bir personel listesi oluşturuluyor.
// Listeye eklenen personellerin bilgilerini ekrana yazdıran uygulama

class Personel{
    var ad : String
    var ikinciAd : String?
    var soyad : String
    var kimlikNo : String
    var sicilNo : Int

    constructor(ad:String, ikinciAd: String?,soyad:String,kimlikNo : String,sicilNo:Int){
        this.ad = ad
        this.ikinciAd = ikinciAd
        this.soyad = soyad
        this.kimlikNo = kimlikNo
        this.sicilNo = sicilNo
    }

    fun bilgileriYazdir(){
        println("Ad : ${ad}\n") //kaçış metodu \n
        ikinciAd?.let {
            println("İkinci Ad : ${it}\n") //kaçış metodu \n
        }
        println("Soyad : ${soyad}\nKimlik no: ${kimlikNo}\nSicil no: ${sicilNo}")

    }
}