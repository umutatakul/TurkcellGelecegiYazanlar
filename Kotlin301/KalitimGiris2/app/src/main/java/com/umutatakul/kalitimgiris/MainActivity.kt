package com.umutatakul.kalitimgiris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dikdortgen = Dikdortgen(10f,50f,"Kırmızı")
        //dikdortgen.cevre = 100f
        println(dikdortgen.cevre)
        var kare = Kare(24f,"Mavi")
        //kare.alan =200f
        println(kare.alan)


    }
}

class Kare (kenar : Float, renk: String): Sekil ("Kare",renk)

 {
    //var kenar : Float? = null
    init {
        cevre = kenar * 4
        alan = kenar * kenar
    }

}
class Dikdortgen : Sekil {
    var kisaKenar : Float
    var uzunKenar : Float

    constructor(k : Float, u :Float, renk: String) : super(isim = "Dikdörtgen" , renk ) {
        kisaKenar = k
        uzunKenar = u

        cevre =(kisaKenar+uzunKenar) *2
        alan = kisaKenar * uzunKenar
    }
}
open class Sekil (isim : String  , renk : String  ){
    var cevre : Float? = null
    var alan : Float? = null
}