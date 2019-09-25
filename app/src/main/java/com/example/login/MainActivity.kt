package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogIn.setOnClickListener() {
            Toast.makeText(this,  "VALIDATING DATA", Toast.LENGTH_SHORT).show()

            val sendData = Intent(this, Home::class.java).apply {
                putExtra("name", txtName.text.toString())
                putExtra("pass", txtPassword.text.toString())
            }
            startActivity(sendData)
        }
    }
}
