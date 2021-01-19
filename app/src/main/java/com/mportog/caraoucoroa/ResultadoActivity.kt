package com.mportog.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val dados : Bundle ?= intent.extras
        val face = dados!!.getBoolean("face")

        if(face){
            img_result.setImageResource(R.drawable.moeda_cara)
        }
        else
        {
            img_result.setImageResource(R.drawable.moeda_coroa)
        }

        back_btn.setOnClickListener {
            finish()
        }
    }
}