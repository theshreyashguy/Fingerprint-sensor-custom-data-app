package com.example.iiit_retrun0_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class non_student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_student)

        val pass = findViewById<EditText>(R.id.admin_name)
        val b = findViewById<Button>(R.id.check)
    val  m = findViewById<EditText>(R.id.rollofstudent)
        b.setOnClickListener {
            val c : String = pass.text.toString()
            check1(c,m.text.toString())



        }
        
    }

    private fun check1(x: String,y:String) {
        if( x == "IIIT_12#$56&*" && y=="shreyash"){
            val myIntent = Intent(this@non_student,Control::class.java)

            this@non_student.startActivity(myIntent)
        }
        else{
            Toast.makeText(applicationContext,"Wrong password", Toast.LENGTH_LONG).show();
        }

    }
}