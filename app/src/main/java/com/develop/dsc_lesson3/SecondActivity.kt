package com.develop.dsc_lesson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.develop.dsc_lesson3.databinding.ActivityMainBinding
import com.develop.dsc_lesson3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener {
            val intent =Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}