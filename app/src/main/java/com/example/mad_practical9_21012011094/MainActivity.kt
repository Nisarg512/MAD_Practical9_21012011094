package com.example.mad_practical9_21012011094

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarm:ImageView=findViewById(R.id.image)
        alarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation=alarm.background as AnimationDrawable

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus)
        {
            alarmanimation.start()
        }
        else
        {
            alarmanimation.stop()
        }
    }
}