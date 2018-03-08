package com.example.eijaz.lottietutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        av_from_code.setAnimation("drink.json")
        av_from_code.playAnimation()
        av_from_code.loop(true)

    }
}
