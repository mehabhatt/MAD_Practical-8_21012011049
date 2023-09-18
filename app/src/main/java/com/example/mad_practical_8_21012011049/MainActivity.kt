package com.example.mad_practical_8_21012011049

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clockTC = findViewById<TextClock>(R.id.clocktime)
        clockTC.format24Hour = "hh:mm:ss a"
    }
}