package com.example.loadinganimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loadinAnim=findViewById<LoadingAnimation>(R.id.loadinAnim);
        loadinAnim.setProgressVector(resources.getDrawable(R.drawable.fidget));
        loadinAnim.setTextStyle(true)
        Handler().postDelayed(
            {
            loadinAnim.visibility= View.GONE;
            },2000
        )
    }
}