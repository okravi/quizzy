package com.example.quizzy

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.quizzy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*@RequiresApi(Build.VERSION_CODES.M)
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
    }*/

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val btn_start : Button = binding.btnStart
        val et_name : EditText = binding.etName

        binding.btnStart.setOnClickListener(){
            if (binding.etName.text != null ){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }
        }
    }


}