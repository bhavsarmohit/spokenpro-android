package com.spokenpro.spokenpro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class signUp : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.hide()

        val signupbtn: Button = findViewById(R.id.btn_signUp)
        val etName: TextInputLayout = findViewById(R.id.et_name)
        val etEmail: TextInputLayout = findViewById(R.id.et_email)
        val etMobile: TextInputLayout = findViewById(R.id.et_mobile)
        val etPass: TextInputLayout = findViewById(R.id.et_password)
        val imgbglogo: ImageView = findViewById(R.id.img_bg)
        val tv_signIn: TextView = findViewById(R.id.tv_signIn)

        signupbtn.setOnClickListener{
            val intent = Intent(this, signIn::class.java)
            startActivity(intent)
        }
        tv_signIn.setOnClickListener{
            val intent = Intent(this, signIn::class.java)
            startActivity(intent)
        }

        val animationFadeIn = AnimationUtils.loadAnimation(this, R.animator.anim_fade_in)
        imgbglogo.startAnimation(animationFadeIn)
        val animationMoveDownIn = AnimationUtils.loadAnimation(this, R.animator.anim_move_down_in)
        imgbglogo.startAnimation(animationMoveDownIn)

        val animationMoveLeftIn = AnimationUtils.loadAnimation(this,R.animator.anim_move_left_in)
//        etName.startAnimation(animationMoveLeftIn)
//        etEmail.startAnimation(animationMoveLeftIn)
//        etMobile.startAnimation(animationMoveLeftIn)
//        etPass.startAnimation(animationMoveLeftIn)
        signupbtn.startAnimation(animationMoveLeftIn)




    }

    override fun onStart() {
//        overridePendingTransition(0, 0)

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        super.onStart()
    }

    override fun onPause() {
        if (isFinishing) {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        super.onPause()
    }

}