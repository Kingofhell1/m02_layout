package com.example.m02_layout

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.get
import androidx.core.view.setPadding
import com.example.m02_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.custom.setMessageTopText("верхняя строчка, настроенная из кода")
        binding.custom.setMessageBottomText("нижняя строчка, настроенная из кода")
    }
}
//---------------------Можно вывести и через данные методы------------------------
//resources.getString(R.string.topText) //верхний текст
//resources.getString(R.string.bottomTExt) // нижний текст
