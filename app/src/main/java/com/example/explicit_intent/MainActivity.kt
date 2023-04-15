package com.example.explicit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btn1 = findViewById(R.id.Button1)
        btn1.setOnClickListener {

            val intent = Intent(applicationContext, SecondActivityIntent::class.java)
            startActivity(intent)
            finish()
        }

    }


}