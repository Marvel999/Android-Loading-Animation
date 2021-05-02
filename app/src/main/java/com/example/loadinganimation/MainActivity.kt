package com.example.loadinganimation

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.black_loading_anim)
        FullScreencall();
//        val loadingAnim=findViewById<LoadingAnimation>(R.id.loadinAnim);

//        loadingAnim.setProgressVector(resources.getDrawable(R.drawable.black_three_dot_circle))
//        loadingAnim.setTextViewVisibility(true)
//        loadingAnim.setTextStyle(true)
//        loadingAnim.setTextColor(Color.YELLOW)
//        loadingAnim.setTextSize(12F)
//        loadingAnim.setTextMsg("Please Wait")
//        loadingAnim.setEnlarge(5)



    }

    fun FullScreencall() {
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            val v = this.window.decorView
            v.systemUiVisibility = View.GONE
        } else if (Build.VERSION.SDK_INT >= 19) {
            //for new api versions.
            val decorView = window.decorView
            val uiOptions =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            decorView.systemUiVisibility = uiOptions
        }
    }
}