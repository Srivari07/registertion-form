package com.example.registertionform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

private const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Successfully!!!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)

        fun submit(){
            Log.i(TAG, "register")
            toast.show()
        }
        val registerbt: Button = findViewById(R.id.btRegister)
        registerbt.setOnClickListener {
            submit()
        }

    }
}