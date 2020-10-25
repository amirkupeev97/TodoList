package com.example.todolist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.R
import com.example.todolist.model.Todo
import com.example.todolist.ui.fragments.TodosFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
      val manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ShowFragment()



    }
    fun ShowFragment(){

            val transaction = manager.beginTransaction()
            val fragment = TodosFragment()
            transaction.replace(R.id.listfrag, fragment)
            transaction.commit()

        }

    }

