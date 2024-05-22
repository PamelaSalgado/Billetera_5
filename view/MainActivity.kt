package com.example.evaluacion_m4.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.evaluacion_m4.R
import com.example.evaluacion_m4.viewModel.Login_page

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_ingresar = findViewById<View>(R.id.btn_ingresar)
        btn_ingresar.setOnClickListener {
            val intent = Intent(this, Login_page::class.java)
            startActivity(intent)
        }
    }
}