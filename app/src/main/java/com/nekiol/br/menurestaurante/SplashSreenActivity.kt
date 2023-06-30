package com.nekiol.br.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashSreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_sreen)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = intent
            val j = Intent(this, DadosPedidoActivity2::class.java)
            j.putExtras(i)
            startActivity(j)
        }, 2000)
    }
}