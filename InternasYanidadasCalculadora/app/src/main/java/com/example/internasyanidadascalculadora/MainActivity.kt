package com.example.internasyanidadascalculadora

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    var etn_valor1:EditText? =null
    lateinit var tv_resultado:TextView
    lateinit var etn_valor2:EditText
lateinit var rb_suma:RadioButton
    lateinit var rb_resta:RadioButton
    lateinit var rb_multiplicacion:RadioButton
    lateinit var rb_division:RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etn_valor1 = findViewById(R.id.ent_view1)
        etn_valor2 = findViewById(R.id.ent_view2)
        tv_resultado = findViewById(R.id.tv_resultado)
        rb_suma = findViewById(R.id.rb_suma)
        rb_resta=findViewById(R.id.rb_resta)
        rb_multiplicacion=findViewById(R.id.rb_multiplicacion)
        rb_division = findViewById(R.id.rb_division)

        //claseAnidadasEinternas()
    }

  fun calcular(vista:View){
        val valor1_String = etn_valor1?.text.toString()
        val valor2_String = etn_valor2.text.toString()

        val valor1_Int = valor1_String.toInt()
        val valor2_Int = Integer.parseInt(valor2_String)

        if(rb_suma.isChecked==true){
            val suma = valor1_Int + valor2_Int
            val resultado = suma.toString()
            tv_resultado.setText(resultado)
        }else if (rb_resta.isChecked==true){
            val resta = valor1_Int - valor2_Int
            val resultado = resta.toString()
            tv_resultado.setText(resultado)
        }else if (rb_multiplicacion.isChecked==true){
            val multiplicacion = valor1_Int * valor2_Int
            val resultado = multiplicacion.toString()
            tv_resultado.setText(resultado)
        }else if (rb_division.isChecked==true){
            val division = valor1_Int / valor2_Int
            val resultado = division.toString()
            tv_resultado.setText(resultado)
        } else{
          Toast.makeText(this, "valor indefinido",Toast.LENGTH_LONG).show()

        }






  }

    private fun claseAnidadasEinternas(){
     //Clase Anidada (nester class)
     val miClaseAnidadas =  mClaseAnidadaEinterna.miClaseAnidadas()
     val  sumarDosNumeros= miClaseAnidadas.suma(4,6)
      println("El resultado de la suma es $sumarDosNumeros")


          //Clase Interna (inner class)
         val miClaseInterna1 = mClaseAnidadaEinterna().miClaseInterna()
        val sumarDos = miClaseInterna1.sumarDos(2)
        println("El resultado de la suma dos es $sumarDos")
}
    fun btnSiguiente(Vista:View){
        val ventaSiguiente:Intent= Intent(applicationContext,LinkViewApp::class.java)
        startActivity(ventaSiguiente)
    }
}