package com.nekiol.br.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.nekiol.br.menurestaurante.databinding.ActivityDadosPedido2Binding

class DadosPedidoActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityDadosPedido2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedido2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val quant_cofee = i.getStringExtra("quant_cofee").toString().toInt()
        val quant_pao = i.getStringExtra("quant_pao").toString().toInt()
        val quant_chocolate = i.getStringExtra("quant_chocolate").toString().toInt()
        val preco_cofee = i.getDoubleExtra("preco_cofee", 0.0)
        val preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        val preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        val texto = "Resumo do pedido:\n" +
                "Café: $quant_cofee Preço: R$${quant_cofee * preco_cofee}\n" +
                "Pão: $quant_pao Preço: R$${quant_pao * preco_pao}\n" +
                "Chocolate: $quant_chocolate Preço: R$${quant_chocolate * preco_chocolate}";

        binding.textResumo.setText(texto)
    }
}