package com.example.loadinganimation

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import kotlin.properties.Delegates

class LoadingAnimation(context: Context,attributeSet: AttributeSet) : RelativeLayout(context,attributeSet){
    private lateinit var imageView: ImageView;
    private lateinit var drawableFile: Drawable
    private lateinit var view: View
    private lateinit var bgprogress: View
    private lateinit var msgTextView: TextView
    private var textColor=1
    private var enlarge=1
    private var textSize:Float = 0.0f

    init {
       val arr=context.obtainStyledAttributes(R.attr)
    }




}