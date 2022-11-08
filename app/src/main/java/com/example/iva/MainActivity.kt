package com.example.iva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtprecio = findViewById<EditText>(R.id.txtMonto)
        val btnregistrar = findViewById<Button>(R.id.btnEnviar)


        btnregistrar.setOnClickListener {
            val intent = Intent(this, ImporteActivity2::class.java)

            intent.putExtra("precio", txtprecio.text.toString())
            startActivity(intent)
        }
    }
}