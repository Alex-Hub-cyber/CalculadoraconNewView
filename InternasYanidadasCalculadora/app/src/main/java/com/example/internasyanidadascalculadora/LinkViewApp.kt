package com.example.internasyanidadascalculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class LinkViewApp : AppCompatActivity() {
    private var Lv_Lenguajes:ListView?=null
    private var Tv_seleccion:TextView?=null

    private val lenguajes= arrayOf("Kotlin","Java","C++","C#","Php","Visual Basic.net")
    private val posicion = arrayOf("1","6","3","2","4","5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link_view_app)
        Lv_Lenguajes=findViewById(R.id.tV_Lenguajes)
        Tv_seleccion=findViewById(R.id.Tv_Seleccion)
        var adaptador:ArrayAdapter<String> =ArrayAdapter<String>(this,R.layout.nuevo,lenguajes)
        Lv_Lenguajes?.adapter = adaptador
        Lv_Lenguajes?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?,
                                        p1: View?,
                                        p2: Int,
                                        p3: Long)
            {
//                TODO("Not yet implemented")
               Tv_seleccion?.text = "La posicion del lenguaje ${Lv_Lenguajes?.getItemAtPosition(p2)} es ${posicion[p2]}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}