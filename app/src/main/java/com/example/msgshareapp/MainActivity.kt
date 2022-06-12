package com.example.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{

            Log.i("MainActivity", "Button was clicked !")
            Toast.makeText(this,"Button was clicked !",Toast.LENGTH_SHORT).show()
        }

        btnSendData.setOnClickListener {

            val message: String =  etUserMsg.text.toString()
//            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)

        }
    }

}