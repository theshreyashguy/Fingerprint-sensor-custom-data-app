package com.example.iiit_retrun0_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Student_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        setContentView(/* layoutResID = */ R.layout.activity_student)
        val roll1 = findViewById<EditText>(R.id.rollnumber)
        val name2 = findViewById<EditText>(R.id.rollofstudent)

        val btn = findViewById<Button>(R.id.check)

        btn.setOnClickListener {
            if(check1(roll1.text.toString(),name2.text.toString())){
                val myIntent = Intent(this@Student_activity,activity_of_student::class.java)


                this@Student_activity.startActivity(myIntent)
            }



    }
}
    private fun check1(a:String,b:String): Boolean {

        if(a=="21241" && b== "shr12yash" ){
            return true
        }
        if(a == "21242" && b == "shu12bam"){
            return true
        }

       return  false
    }
}