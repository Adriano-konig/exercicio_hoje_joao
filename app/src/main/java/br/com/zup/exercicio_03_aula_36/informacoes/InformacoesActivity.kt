package br.com.zup.exercicio_03_aula_36.informacoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.exercicio_03_aula_36.databinding.ActivityInformacoesBinding
import br.com.zup.exercicio_03_aula_36.informacoes.adapter.InformacoesPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class InformacoesActivity : AppCompatActivity(){

    private lateinit var binding: ActivityInformacoesBinding
//    private lateinit var interfaceClick: FragmentoClick
    private val listaTitulos = listOf("Informações","Fotos")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformacoesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirAppBarCustomizada()
        exibirViewPagerTabLayout()
    }

    private fun exibirAppBarCustomizada(){
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Detalhes da banda")
    }

    private fun exibirViewPagerTabLayout(){

        val informacoesPagAdapter = InformacoesPagerAdapter(supportFragmentManager,lifecycle,listaTitulos)
        binding.vpInformacoes.adapter = informacoesPagAdapter

        TabLayoutMediator(binding.tlinformacoes,binding.vpInformacoes){ tab, posicao ->
            tab.text = listaTitulos[posicao]
        }.attach()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}