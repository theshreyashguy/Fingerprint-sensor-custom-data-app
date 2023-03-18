package com.example.iiit_retrun0_1

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlinx.coroutines.*
import org.w3c.dom.Text
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class Control : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)
        val time = findViewById<TextView>(/* id = */ R.id.timenow)

        val show = findViewById<Button>(R.id.download)

        show.setOnClickListener {

             val openurl = Intent(Intent.ACTION_VIEW)

            openurl.data = Uri.parse("https://docs.google.com/spreadsheets/d/1Mb3SEoxM5R48r7LX9hSg8852XOrjKBNDmL6dzlYVrgc/edit?usp=sharing")

            startActivity(openurl)

        }


        CoroutineScope(Dispatchers.IO).launch {
            withContext(Dispatchers.Main) {
                while(true) {
                    time.setText(getCurrentime());
                    delay(1000)
                }
            }
        }

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun getCurrentime(): String {
        val current = LocalDateTime.now()
        val formatter =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        val formatted = current.format(formatter)
        return formatted.toString()

    }
}