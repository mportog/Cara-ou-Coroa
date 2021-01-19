package com.mportog.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play_btn.setOnClickListener {
            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            val face = Random().nextBoolean()
            intent.putExtra("face", face)
        startActivity(intent)
        }
    }
}