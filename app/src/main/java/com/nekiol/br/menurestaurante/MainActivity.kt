package com.nekiol.br.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.nekiol.br.menurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoCofee = 1.0
    private val precoPao = 0.5
    private val precoChocolate = 3.2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPedido.setOnClickListener {
            val i = Intent(this, SplashSreenActivity::class.java)
            i.putExtra("quant_cofee", binding.editQuantidadeCofee.text.toString())
            i.putExtra("quant_pao", binding.editQuantidadePao.text.toString())
            i.putExtra("quant_chocolate", binding.editQuantidadeChocolate.text.toString())
            i.putExtra("preco_cofee", precoCofee)
            i.putExtra("preco_pao", precoPao)
            i.putExtra("preco_chocolate", precoChocolate)
            startActivity(i)
        }
        binding.checkCofee.setOnClickListener{
            if (binding.checkCofee.isChecked()){
                binding.editQuantidadeCofee.setText("1")
                binding.textPrecoCofee.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeCofee.setText("0")
                binding.textPrecoCofee.visibility = View.GONE
            }
        }
        binding.checkChocolate.setOnClickListener {
            if (binding.checkChocolate.isChecked()){
                binding.editQuantidadeChocolate.setText("1")
                binding.textPrecoChocolate.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeChocolate.setText("0")
                binding.textPrecoChocolate.visibility = View.GONE
            }
        }
        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()){
                binding.editQuantidadePao.setText("1")
                binding.textPrecoPao.visibility = View.VISIBLE
            }else{
                binding.editQuantidadePao.setText("0")
                binding.textPrecoPao.visibility = View.GONE
            }
        }

    }
}