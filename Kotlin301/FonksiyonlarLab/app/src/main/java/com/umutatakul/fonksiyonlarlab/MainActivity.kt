package com.umutatakul.fonksiyonlarlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Elimizde bulunan puan listesine göre bu listedeki en düşük puanın, en yüksek puanın
        //değerlerini hesaplatıp kullanıcıya gösterelim

        val liste = intArrayOf(34,45,64,44,3,100,55)

        var sonuc = PuanlariHesapla(liste)

        println("En düşük puan: ${sonuc.first}")
        println("En yüksek puan: ${sonuc.second} ")
    }

    fun PuanlariHesapla(puanlar:IntArray):Pair<Int,Int>{
        var dusuk= puanlar[0]
        var yuksek = puanlar[0]
        for (puan in puanlar){
            if (puan<dusuk){
                dusuk = puan
            }else if (puan>yuksek) {
                yuksek = puan
            }
        }


        return Pair(dusuk,yuksek)
    }
}