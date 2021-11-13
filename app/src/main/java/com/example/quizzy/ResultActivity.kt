package com.example.quizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.quizzy.databinding.ActivityQuizQuestionsBinding
import com.example.quizzy.databinding.ActivityResultBinding

private lateinit var binding: ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val tvName: TextView = binding.tvName
        val tvScore: TextView = binding.tvScore
        val btnFinish: Button = binding.btnFinish

        binding.tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val questionsNumber = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)


        tvScore.text = "Your score is $mCorrectAnswers out of $questionsNumber"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}