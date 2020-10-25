package com.example.mailapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mailapp.R.layout.activity_email

class Email : AppCompatActivity() {
    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_email)
        ShowFragment1()


    }

    fun ShowFragment1() {
        val transaction = manager.beginTransaction()
        val fragment = mail_list()
        transaction.replace(R.id.fragment1, fragment)
        transaction.commit()

    }
    fun ShowFragment2(){
        val transaction2 = manager.beginTransaction()
        val fragment2 = mail_detail()
        transaction2.replace(R.id.fragment2, fragment2)
        transaction2.commit()

    }

}