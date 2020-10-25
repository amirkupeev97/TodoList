package com.example.todolist.ui.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.R
import com.example.todolist.model.Todo
import com.example.todolist.ui.TodoAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.todos_fragment.*

class TodosFragment : Fragment(R.layout.todos_fragment) {


    val todoAdapter = TodoAdapter(mutableListOf())



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            return inflater.inflate(R.layout.todos_fragment, container, false)

            fun getView(): View? {
                return super.getView()
            }


        }
        btnAddTodo.setOnClickListener {
            val todoTitle = etTodoTitle.text.toString()
            if(todoTitle.isNotEmpty()) {
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
                etTodoTitle.text.clear()
            }
        }
        btnDeleteDoneTodos.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }




    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rvTodoItems.adapter=todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(activity)
    }


}

