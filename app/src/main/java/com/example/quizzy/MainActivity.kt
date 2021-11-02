package com.example.quizzy

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start : Button = findViewById(R.id.btn_start)
        val et_nameX : EditText = findViewById(R.id.et_name)
        var t1 : Int = 0

        btn_start.setOnContextClickListener {

            if (et_nameX.text.isEmpty())
            {true -> println(t1)}

        }
    }
}