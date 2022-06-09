package br.com.zup.exercicio_03_aula_36.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.zup.exercicio_03_aula_36.databinding.ActivityMainBinding
import br.com.zup.exercicio_03_aula_36.informacoes.InformacoesActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var botaoMain: Button? = null

//    private val adapter: InformacoesPagerAdapter by lazy {
//        InformacoesPagerAdapter(this,)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        botaoMain = findViewById(R.id.button)

        binding.button.setOnClickListener {
            startActivity(Intent(this, InformacoesActivity::class.java))
        }

//        botaoMain?.setOnClickListener{
//            val intent = Intent(this, Detalhes::class.java)
//            startActivity(intent)
//        }
    }


//    private fun irParaInformacoes(musica: Musica){
//        val intent = Intent(this,informacoesActivity::class.java).apply {
//            putExtra(MUSICA_KEY,musica)
//        }
//        startActivity(intent)
//    }

}