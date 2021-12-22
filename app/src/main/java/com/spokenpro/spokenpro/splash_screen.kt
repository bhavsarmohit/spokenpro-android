package com.spokenpro.spokenpro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

import android.os.Build
import android.view.Window
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.imageview.ShapeableImageView
import android.animation.AnimatorSet

import android.animation.ObjectAnimator
import android.os.Handler
import java.lang.Thread.sleep
import java.util.concurrent.TimeUnit
import android.widget.Toast





class splash_screen : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }
        setContentView(R.layout.splash_screen)


        val imagebgTop: ShapeableImageView = findViewById(R.id.shapeableImageViewTop)
        val imgbgBottom: ShapeableImageView = findViewById(R.id.shapeableImageViewBottom)
        val imgLogo: ImageView = findViewById(R.id.logo)

        val animationFadeIn = AnimationUtils.loadAnimation(this, R.animator.anim_fade_in)
        val animationImgTop = AnimationUtils.loadAnimation(this, R.animator.anim_splash_img_top)
        val animationImgBottom = AnimationUtils.loadAnimation(this, R.animator.anim_splash_img_bottom)




        imagebgTop.startAnimation(animationImgTop)
        imgbgBottom.startAnimation(animationImgBottom)
        imgLogo.startAnimation(animationFadeIn)


//        sleep(3000)
//
//        val scaleDownX = ObjectAnimator.ofFloat(imgLogo, "scaleX", 0.7f)
//        val scaleDownY = ObjectAnimator.ofFloat(imgLogo, "scaleY", 0.7f)
//        scaleDownX.duration = 1500
//        scaleDownY.duration = 1500
//
//        val moveUpY: ObjectAnimator = ObjectAnimator.ofFloat(imgLogo, "translationY", -100)
//        moveUpY.duration = 1500
//
//        val scaleDown = AnimatorSet()
//        val moveUp = AnimatorSet()
//
//        scaleDown.play(scaleDownX).with(scaleDownY)
//        moveUp.play(moveUpY)
//
//        scaleDown.start()
//        moveUp.start()

        Handler().postDelayed({


//            Toast.makeText(this, "paused", Toast.LENGTH_SHORT).show()
//
//
//            imgLogo.animate().translationY(-200F).duration = 500
//            imgLogo.animate().scaleY(0.7F).duration = 500
//            imgLogo.animate().scaleX(0.7F).duration = 500
////



//            sleep(5000)

            val intent = Intent(this, signIn::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 3000 is the delayed time in milliseconds.






//        val signin: Button = findViewById(R.id.btn_signIn)
//        val signup: Button = findViewById(R.id.btn_signUp)
//        val chooseYourselfbtn: Button = findViewById(R.id.btn_chooseYourself)
//
//        signin.setOnClickListener {
//            val intent = Intent(this, signIn::class.java)
//            startActivity(intent)
//        }
//
//        signup.setOnClickListener{
//            val intent = Intent(this, signUp::class.java)
//            startActivity(intent)
//        }
//
//        chooseYourselfbtn.setOnClickListener {
//            val intent = Intent(this, chooseYourself::class.java)
//            startActivity(intent)
//        }
    }

    override fun onPause() {
        super.onPause()
//        Toast.makeText(this, "paused", Toast.LENGTH_SHORT).show()
//        imgLogo.animate().translationY(-200F).duration = 500
//        imgLogo.animate().scaleY(0.7F).duration = 500
//        imgLogo.animate().scaleX(0.7F).duration = 500
    }


}