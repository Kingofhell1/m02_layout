package com.example.m02_layout

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView


class CustomActivityPost @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null):
    LinearLayout(context,attrs){
    init{
        inflate(context, R.layout.custom_post, this)
    }


}