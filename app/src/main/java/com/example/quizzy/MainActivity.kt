package com.example.quizzy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizzy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //val btnStart : Button = binding.btnStart
        //val et_name : EditText = binding.etName

        binding.btnStart.setOnClickListener(){
            if (binding.etName.text.isNullOrEmpty()){
                Toast.makeText(this, "Name can not be empty", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }


}
