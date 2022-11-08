package com.example.iva

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide.*

class ImporteActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_importe2)

        val bundle = intent.extras
        val datoPr = bundle?.getString("precio") // Este es para que reciba los valores de la vairbale texField "Precios"
        val txtiva = findViewById<EditText>(R.id.txtIva)
        val txt_total = findViewById<EditText>(R.id.txtTotal)
        val txt_monto = findViewById<EditText>(R.id.txtMonto2)
        val img = findViewById<ImageView>(R.id.imgGif)

        val aux = datoPr?.toDouble();
        val iva =
            datoPr?.toDouble()?.times(.16) // En este se calcula el monto inicial mas con el IVA
        val total =
            iva?.plus(aux!!)// En este lo que se hace es dar como resultado el total con el IVA incluido

        txtiva.setText(iva.toString())
        txt_total.setText(total.toString())
        txt_monto.setText(datoPr.toString())
        if (total != null) {
            if(total > 100){

                val urlGif:String = "https://i.gifer.com/origin/d7/d787d998103cc44e74f607cfd48d130f.gif"
                val urlParse: Uri = Uri.parse(urlGif)

                with(applicationContext).load(urlParse).into(img)
            }else {
                val urlGif:String = "https://i.gifer.com/7rCc.gif"
                val urlParse: Uri = Uri.parse(urlGif)

                with(applicationContext).load(urlParse).into(img)

            }
        }
    }
}