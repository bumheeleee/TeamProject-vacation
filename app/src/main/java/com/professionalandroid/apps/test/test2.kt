package com.professionalandroid.apps.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_test2.*
import kotlinx.android.synthetic.main.activity_test2.view.*
import kotlinx.android.synthetic.main.activity_test2.view.btn_Login

class test2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
        //val btnlogin:Button = findViewById(R.id.btn_Login)
        btn_Login.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}