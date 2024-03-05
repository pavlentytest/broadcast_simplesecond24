package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val flag = intent.getBooleanExtra("status",false)
        if(flag) {
            Toast.makeText(context, "Airplane mode is on!",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Airplane mode is off!",Toast.LENGTH_LONG).show()
        }
    }
}