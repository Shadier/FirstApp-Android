package com.example.login

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_home.*


class Home : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mIntent = intent
        val name = mIntent.getStringExtra("name")
        val pass = mIntent.getStringExtra("pass")

        lblMessage.text = "Hi ${name} you had sent your information without know why, your password is: '${pass}' see you!"
    }
}
