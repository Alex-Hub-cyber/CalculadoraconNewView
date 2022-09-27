package com.example.internasyanidadascalculadora

class mClaseAnidadaEinterna {
    //Clase aninada es una  clase que puede estar dentro de otra clase

    private val uno = 1
    private fun retornarUno():Int{
        return uno
    }



    class miClaseAnidadas(){
        fun suma (n1:Int,n2:Int):Int{
            return n1+n2

        }
    }
    inner class miClaseInterna(){
        fun sumarDos(num:Int):Int{
            return num + uno + retornarUno()
        }
    }

}