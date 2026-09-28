package com.abdu.ejemplosviews

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val escribirNombre: EditText = findViewById(R.id.escribirNombre)
        val botSaludo: Button = findViewById(R.id.botSaludo)
        val botLimpiar: Button = findViewById(R.id.botLimpiar)
        val textView3: TextView = findViewById(R.id.textView3)


        botSaludo.setOnClickListener {
            val nombre = escribirNombre.text.toString().trim()

            if (nombre.isNotEmpty()) {

                textView3.text = "Hola, $nombre"

                Toast.makeText(this, "¡Bienvenido/a, $nombre!", Toast.LENGTH_SHORT).show()
            } else {
                textView3.text = ""
                Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show()
            }
        }


        botLimpiar.setOnClickListener {
            escribirNombre.text.clear()
            textView3.text = ""
        }
    }

}