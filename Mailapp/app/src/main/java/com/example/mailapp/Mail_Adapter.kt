package com.example.mailapp

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView




import android.view.LayoutInflater;


class MailAdapter( mEmailData: List<EmailData>) :
    RecyclerView.Adapter<MailViewHolder?>() {
    private val mEmailData: List<EmailData>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.recyclerview_mail_item,
            parent, false
        )
        return MailViewHolder(view)
    }

    override fun onBindViewHolder(holder: MailViewHolder, position: Int) {
        holder.mIcon.setText(mEmailData[position].getmSender().substring(0, 1))
        holder.mSender.setText(mEmailData[position].getmSender())
        holder.mEmailTitle.setText(mEmailData[position].getmTitle())
        holder.mEmailDetails.setText(mEmailData[position].getmDetails())
        holder.mEmailTime.setText(mEmailData[position].getmTime())


    }



    override fun getItemCount(): Int {
        return mEmailData.size
    }

    init {
        this.mEmailData = mEmailData

    }
}

class MailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var mIcon: TextView
    var mSender: TextView
    var mEmailTitle: TextView
    var mEmailDetails: TextView
    var mEmailTime: TextView
    var mLayout: RelativeLayout

    init {
        mIcon = itemView.findViewById(R.id.tvIcon)
        mSender = itemView.findViewById(R.id.tvEmailSender)
        mEmailTitle = itemView.findViewById(R.id.tvEmailTitle)
        mEmailDetails = itemView.findViewById(R.id.tvEmailDetails)
        mEmailTime = itemView.findViewById(R.id.tvEmailTime)
        mLayout = itemView.findViewById(R.id.layout)
    }
}