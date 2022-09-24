package com.zoro.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zoro.homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    onclick()
    }

    fun onclick() {
        binding.btnPlus.setOnClickListener {
            count += 1
            binding.zero.text = count.toString()
            if (count == 10 || binding.zero.text.equals("-")) {
                binding.btnPlus.text="-"
                binding.btnPlus.setOnClickListener {
                    count -= 1
                    binding.zero.text = count.toString()
                    if(count==0){

                        val intent = Intent(this,SecondActivity::class.java)
                        startActivity(intent)
                    }
            }}
    }
}}