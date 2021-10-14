package com.example.lab_ll_luisdiaz

open class Vehiculo (nombre:String, precio:Double, color:String):Marca {

    open fun disponibilidad(){
        println("Disponibilidad: Agotado")
    }

    override val marca = "Toyota"
    override fun marcaVehiculo() {
        println("Marca: $marca")
    }
}