package com.example.m02_layout

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.example.m02_layout.databinding.ActivityMainBinding
import com.example.m02_layout.databinding.CustomPostBinding


class CustomActivityPost @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null):

    LinearLayout(context,attrs){
        private var binding: CustomPostBinding
    init{
        val inflatedView = inflate(context, R.layout.custom_post, this)
        binding = CustomPostBinding.bind(inflatedView)
    }
    fun setMessageTopText(text: String) {
        binding.topText.text = text
    }

    fun setMessageBottomText(text: String) {
        binding.bottomText.text = text
    }


}