package com.example.mailapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPref=getSharedPreferences("PrefOne", Context.MODE_PRIVATE)
        val editor=sharedPref.edit()
        button1.setOnClickListener {
            val login = etLogin.text.toString()
            val pswrd = etPswrd.text.toString()
            editor.apply{
                putString("login" , login)
                putString("password",pswrd)
                apply()
            }
            Intent(this,Email::class.java).also {
                startActivity(it)
            }
        }
    }
}