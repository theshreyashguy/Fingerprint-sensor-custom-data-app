package com.example.iiit_retrun0_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import android.widget.Toast
import android.util.Log
import com.example.iiit_retrun0_1.databinding.ActivityStudentBinding


class activity_of_student : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_of_student)
        val bt = findViewById<Button>(R.id.submm)
        val des  = findViewById<EditText>(R.id.destination)
      
        bt.setOnClickListener {
             val d = des.text.toString()

             update(d,"21241")

        }

    }
   // https://script.google.com/macros/s/AKfycby424TF8pVmU0FRzrg9QrwtFDs_wSQUryf7EcVrEu_pTYcPfvOlIvUDJnsmS2vLzKwj/exec?rollnumber=21241&destination=school
    private fun update(dest:String,roll1:String) {


            val weburl:String = "https://script.google.com/macros/s/AKfycby424TF8pVmU0FRzrg9QrwtFDs_wSQUryf7EcVrEu_pTYcPfvOlIvUDJnsmS2vLzKwj/exec?"
           val url:String = weburl + "rollnumber=" +  roll1.toString() + "&destination=" + dest.toString()

            val stringrequest  = StringRequest(Request.Method.POST,url,com.android.volley.Response.Listener {

                Toast.makeText(this@activity_of_student,"sent",Toast.LENGTH_LONG).show()

            },com.android.volley.Response.ErrorListener {

                Toast.makeText(this@activity_of_student,"fail",Toast.LENGTH_LONG).show()

            })

            val queue:RequestQueue = Volley.newRequestQueue(this@activity_of_student)
            queue.add(stringrequest)




    }
}