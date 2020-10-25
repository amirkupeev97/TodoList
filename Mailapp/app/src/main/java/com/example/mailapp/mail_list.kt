package com.example.mailapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_mail_list.*


class mail_list : Fragment(R.layout.fragment_mail_list) {
    val mail_list = mutableListOf(
        EmailData("Paul", "Medicine", "I think you should take those medicines", "22:15pm"),
        EmailData("Jokten", "UFC", "How are you friend ?", "10:15pm"),
        EmailData(
            "Tanner",
            "Youtube accounts",
            "I think you should take those medicines",
            "22:15pm"
        ) ,
                EmailData("Lawler", "BigMac", "Visit Macdonalds for BigMac ", "15:15pm"),
        EmailData("Walker", "Dancing", "Dancing class is available now ", "14:15pm"),
        EmailData("Dariga", "Math", "Math test due september", "10:15pm"),
        EmailData("Bartley", "UFC", "How are you friend 11?", "13:17am"),
        EmailData("Jokten", "Math", "Did you solve number ", "10:15pm")
    )


    val adapter = MailAdapter(mail_list)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            return inflater.inflate(R.layout.fragment_mail_list, container, false)

            fun getView(): View? {
                return super.getView()
            }


        }



    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity)
    }
}








