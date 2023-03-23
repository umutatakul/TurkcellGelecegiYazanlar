package com.umutatakul.kalitimlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//Çalışan görevleri olarak Müdür, Müdür yardımcısı, Yazılımcı , Temizlik görevlisi gibi çalışanların
//byluynduğu bir iş yerinde çalışanların bilgilerinin tutulduğu bir yapının modellemesi

open class Calisan{
    var sicilNo : Int
    var ad : String
    var soyad : String
    constructor(sicilNo:Int, ad : String ,soyad : String){
        this.sicilNo = sicilNo
        this.ad = ad
        this.soyad = soyad
    }
}
class Yazilimci (sicilNo:Int, ad : String ,soyad : String): Calisan(sicilNo,ad,soyad){
    var projeninAdi : String?=null
}

class TemizlikGorevlisi(sicilNo:Int, ad : String ,soyad : String):Calisan(sicilNo,ad,soyad){
    var gorevAlani : String? = null
}

open class Yonetici(sicilNo:Int, ad : String ,soyad : String):Calisan(sicilNo,ad,soyad){
    var EkipListesi = arrayListOf<Calisan>()

}
class MudurYardimcisi(sicilNo:Int, ad : String ,soyad : String,departman:String): Yonetici(sicilNo,ad,soyad){
    var sorumlulukAlani : String

    init {
        sorumlulukAlani = departman
    }
}

class  Mudur(sicilNo:Int, ad : String ,soyad : String , mudurluk : String):Calisan(sicilNo,ad,soyad){
    var mudurluk : String
    init {
        this.mudurluk = mudurluk
    }
}