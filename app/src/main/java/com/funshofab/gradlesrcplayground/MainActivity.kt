package com.funshofab.gradlesrcplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.funshofab.data.MessageRepository
import com.funshofab.domain.GetDomainMessageUseCase
import com.funshofab.gradlesrcplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dataDisplay.text = MessageRepository().getMessage()
        binding.domainDisplay.text = GetDomainMessageUseCase().getMessage()
    }
}