package com.umutatakul.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sandalye1 = Sandalye()
        sandalye1.bacakSayisi = 4
        sandalye1.model = "Model 1"
        val sandalye2 = Sandalye()
        sandalye2.bacakSayisi = 6
        sandalye2.model = "Model 2"



        System.out.println(sandalye1.model)
        println(sandalye2.model)

        sandalye1.bacakYuksekligi = 30

        println(sandalye1.bacakYuksekligi)
    }
}
/*
class SinifınAdi{
}
 */

class Sandalye{
    //Özellikler
    //Proporty - Field
    var bacakSayisi : Int = 0
    var model = ""
    //işlevleri

    var bacakYuksekligi : Int = 0
    get
    set

}