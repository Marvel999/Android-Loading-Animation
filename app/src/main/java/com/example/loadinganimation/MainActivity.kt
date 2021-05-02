package com.example.loadinganimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.black_loading_anim)
//        val loadinAnim=findViewById<LoadingAnimation>(R.id.Loa);
//        loadinAnim.setProgressVector(resources.getDrawable(R.drawable.fidget));
//        loadinAnim.setTextStyle(true)
//        Handler().postDelayed(
//            {
//            loadinAnim.visibility= View.GONE;
//            },2000
//        )
    }
}