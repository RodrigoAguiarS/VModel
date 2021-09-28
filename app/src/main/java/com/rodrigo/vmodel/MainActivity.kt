package com.rodrigo.vmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var txtContador: EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button

    var contador: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initContador()
        initClick()

        validarContador()
    }

    private fun validarContador() {
        if (contador > 5){
            contador = 0
        }
    }

    private fun initClick() {
        btnDados.setOnClickListener {
            contador++
            validarContador()
            initContador()
        }
        btnMostrar.setOnClickListener {
            Toast.makeText(this, "Valor do Contador: ${contador.toString()}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initContador() {
        txtContador.setText(contador.toString())
    }

    private fun initDados() {
        txtContador = findViewById(R.id.txtContador)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)
    }
}