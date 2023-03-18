package com.example.iiit_retrun0_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1  = findViewById<Button>(R.id.admin1)
        val button2 = findViewById<Button>(R.id.student)
        button1.setOnClickListener {
            val myIntent = Intent(this@MainActivity,non_student::class.java)


            this@MainActivity.startActivity(myIntent)
        }
        button2.setOnClickListener {
            val newIntent = Intent(this@MainActivity,Student_activity::class.java)


            this@MainActivity.startActivity(newIntent)
        }

    }
}