package com.example.lab_ll_luisdiaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vehiculo()
    }
    fun vehiculo(){
        //Interface
        val vehiculo = Vehiculo("bZ4XConcept", 10000.0, "Verde")
        vehiculo.marcaVehiculo()

        //Modificadores de Acceso
        val modelo = Modelo2()
        modelo.decirModelo()

        //Herencia
        val disponibilidad = Disponibilidad("bZ4XConcept",10000.0, "Verde")
        disponibilidad.disponibilidad()
    }
}