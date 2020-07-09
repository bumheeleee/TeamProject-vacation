package com.professionalandroid.apps.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class intent_test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_test)
        val intent = Intent(this, test2::class.java)
        intent.putExtra("leebumhee" , 100)
        startActivity(intent)

    }



}