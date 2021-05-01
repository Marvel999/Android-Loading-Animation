package com.example.loadinganimation

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlin.properties.Delegates

class LoadingAnimation(context: Context, attributeSet: AttributeSet) :
    RelativeLayout(context, attributeSet) {
    private lateinit var imageView: ImageView;

    @SuppressLint("UseCompatLoadingForDrawables")
    private val default_DrawableFile = resources.getDrawable(R.drawable.clock)
    private lateinit var default_Vgprogress: View
    private val default_msgTextView = "Please Wait..."
    private val default_textColor = Color.BLACK
    private val default_enlarge = 1
    private val default_textSize: Float = 15F


    private lateinit var mContext:Context ;
    private lateinit var attrs:AttributeSet;
    private var styleAttr:Int = 0;

    private lateinit var drawableFile: Drawable
    private lateinit var bgprogress: View
    private lateinit var view: View
    private lateinit var tvMsg: TextView
    private var costumeMsg=default_msgTextView
    private var textColor = default_textColor
    private var enlarge = default_enlarge
    private var textSize: Float = default_textSize
    private var width = 300f;
    private var height = 3002f;
    init {
        mContext=context;
        attrs=attributeSet;
        styleAttr=0
        this.view = this
        inflate(context, R.layout.layout, this);
        val arr = context.obtainStyledAttributes(attributeSet, R.styleable.LoadingAnimation)
        initTypeArray(arr)
    }

    constructor(context: Context, attributes: AttributeSet, defStyle: Int) : this(
        context,
        attributes
    ) {
        mContext=context;
        attrs=attributes;
        styleAttr=defStyle
        var typedArray =
            context.obtainStyledAttributes(attributes, R.styleable.LoadingAnimation, defStyle, 0)
        initTypeArray(typedArray)
        init()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if(MeasureSpec.getMode(widthMeasureSpec)>0 && MeasureSpec.getMode(heightMeasureSpec)>0){
            width = MeasureSpec.getSize(widthMeasureSpec).toFloat()
//        Log.e("Width ",MeasureSpec.getMode(widthMeasureSpec).toString()+"height "+)
            height = MeasureSpec.getSize(heightMeasureSpec).toFloat()
        }else{
            width=400f;
            height=400f;
        }

        setMeasuredDimension(width.toInt(), height.toInt())
    }


    fun init() {
    }


    fun initTypeArray(typedArray: TypedArray) {
       drawableFile= typedArray.getDrawable(R.styleable.LoadingAnimation_barType)!!
        textSize=typedArray.getDimension(R.styleable.LoadingAnimation_textSize,default_textSize)
        textColor = typedArray.getColor(R.styleable.LoadingAnimation_textColor, default_textColor);
        costumeMsg= typedArray.getString(R.styleable.LoadingAnimation_text).toString();
        enlarge = typedArray.getInt(R.styleable.LoadingAnimation_enlarge,default_enlarge);
        imageView = findViewById(R.id.progressImg);
        bgprogress = findViewById(R.id.progBg);
        tvMsg = findViewById(R.id.textMsg);

        if (drawableFile!=null){
            setProgressVector(drawableFile);
        }

        if (costumeMsg!=null){
            setTextMsg(costumeMsg);
        }

        setTextColor(textColor);
        setTextSize(textSize);
        setEnlarge(enlarge);
        typedArray.recycle()
    }

    fun setProgressVector(drawableFile: Drawable){
        Glide
            .with(mContext)
            .load(drawableFile)
            .into(imageView);
    }

    fun setTextMsg(massage:String){
        tvMsg.setText(massage)
    }

    fun setTextColor(textColor:Int){
        tvMsg.setTextColor(textColor)
    }

    fun setTextSize(textSize:Float){
        tvMsg.textSize=textSize;
    }

    fun setEnlarge(enlarge:Int){
        if (enlarge>=1 && enlarge<=10 )
            imageView.getLayoutParams().height = enlarge*100;
    }




}