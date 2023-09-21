package com.example.mad_practical_8_21012011049

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextClock
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardView= findViewById<MaterialCardView>(R.id.card2)
        val createalarm=findViewById<MaterialButton>(R.id.button_alarm)
        createalarm.setOnClickListener{
            TimePickerDialog(this, {tp,hour,minute -> setAlarmTime(hour, minute) },11,0,false).show()
        }
    }
    fun setAlarmTime(hour:Int, minute:Int){
        //cardView.visibility= View.GONE
    }
}