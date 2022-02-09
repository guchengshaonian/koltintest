package com.example.koltinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    /**
     * 初始化
     */
    private fun init() {
        val button = findViewById<Button>(R.id.bt_number)
        button.setOnClickListener{
            val intent = Intent()
            intent.setClass(this, NumberActivity::class.java)
            startActivity(intent)
        }
    }
}