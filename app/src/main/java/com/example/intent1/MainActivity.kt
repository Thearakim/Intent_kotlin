package com.example.intent1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayT.setOnClickListener{
            Log.i("Mainactivity", "Button was clicked!!")

            Toast.makeText(this, "button was clicked!", Toast.LENGTH_SHORT).show()
        }

        click.setOnClickListener{

            var message : String = user_message.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            var intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)

        }
    }
}
