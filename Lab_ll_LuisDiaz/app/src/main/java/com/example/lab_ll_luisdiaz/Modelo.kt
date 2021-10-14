package com.example.lab_ll_luisdiaz

private class Modelo {
    var modelo:String?=null
    fun decirModelo() {
        modelo?.let {
            println("Modelo: $modelo")
        }?:run{
            println("El vehiculo no cuenta con un modelo")
        }
    }
}

class Modelo2(){
    fun decirModelo(){
        val modelo = Modelo()
        modelo.modelo = "Toyota bZ"
        modelo.decirModelo()
    }
}