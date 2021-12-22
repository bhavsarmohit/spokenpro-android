package com.spokenpro.spokenpro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.spokenpro.spokenpro.dashboard.dashboard

class signIn : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

        setContentView(R.layout.activity_sign_in)
        supportActionBar?.hide()

        val signinbtn: Button = findViewById(R.id.btn_signIn)
        val imgbg: ImageView = findViewById(R.id.img_bg)
        val tvSignUp: TextView = findViewById(R.id.tv_signUp)
        val etUsrnm: TextInputLayout = findViewById(R.id.et_username)
        val etPass: TextInputLayout = findViewById(R.id.et_password)
        val btnSign: Button = findViewById(R.id.btn_signIn)
        val tvForgotpass: TextView = findViewById(R.id.tv_forgotPassword)


        signinbtn.setOnClickListener{
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)
        }

        tvSignUp.setOnClickListener{
            val intent = Intent(this, signUp::class.java)
            startActivity(intent)
        }

        tvForgotpass.setOnClickListener{
            val intent = Intent(this, forgotPassword::class.java)
            startActivity(intent)
        }

        val animationFadeIn = AnimationUtils.loadAnimation(this, R.animator.anim_fade_in)
        imgbg.startAnimation(animationFadeIn)
        val animationMoveDownIn = AnimationUtils.loadAnimation(this, R.animator.anim_move_down_in)
        imgbg.startAnimation(animationMoveDownIn)

        val animationMoveLeftIn = AnimationUtils.loadAnimation(this,R.animator.anim_move_left_in)
        etUsrnm.startAnimation(animationMoveLeftIn)
        etPass.startAnimation(animationMoveLeftIn)
        btnSign.startAnimation(animationMoveLeftIn)

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




















