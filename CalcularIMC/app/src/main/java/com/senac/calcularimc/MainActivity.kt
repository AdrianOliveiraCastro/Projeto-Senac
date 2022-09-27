package com.senac.calcularimc


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1 = findViewById<EditText>(R.id.editalt)
        val n2 = findViewById<EditText>(R.id.editpeso)
        val estado = findViewById<TextView>(R.id.txtstatus)
        val res = findViewById<TextView>(R.id.txtResult)
        val btn = findViewById<Button>(R.id.btnResult)
        btn.setOnClickListener {
            if (n1.text.isEmpty() && n2.text.isEmpty())
                return@setOnClickListener
            val val1 = n1.text.toString().toDouble()
            val val2 = n2.text.toString().toDouble()
            val result: Double = val2 / (val1 * val1)
            res.text= "IMC:${"%.2f".format(result)}"
            if (result<17){
                estado.text = "Muito abaixo do peso"
            } else if (result <= 18.5) {
                estado.text = "Abaixo do peso"
            } else if (result <= 24.9) {
                estado.text = "saudavel"
            } else if (result <=29.9) {
                estado.text = "sobre peso"
            }else if (result <=34.9){
                estado.text =  "Obesidade de 1° Grau"
            }else if (result <=39.9){
                estado.text = "Obesidade de 2° Grau"
            }else {
                estado.text = "Obesidade de 3° Grau"

                class MainActivity
            }
        }
    }
}
