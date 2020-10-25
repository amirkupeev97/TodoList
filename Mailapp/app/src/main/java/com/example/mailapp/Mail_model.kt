package com.example.mailapp


     data class EmailData(
        private val mSender: String,
        private val mTitle: String,
        private val mDetails: String,
        private val mTime: String
    ) {
        fun getmSender(): String {
            return mSender
        }

        fun getmTitle(): String {
            return mTitle
        }

        fun getmDetails(): String {
            return mDetails
        }

        fun getmTime(): String {
            return mTime
        }
    }
