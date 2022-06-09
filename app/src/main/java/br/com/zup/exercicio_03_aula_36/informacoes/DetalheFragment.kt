package br.com.zup.exercicio_03_aula_36.informacoes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import br.com.zup.exercicio_03_aula_36.MUSICA_KEY
import br.com.zup.exercicio_03_aula_36.databinding.ActivityDetalheBinding
import br.com.zup.exercicio_03_aula_36.databinding.FragmentDetalheBinding
import br.com.zup.exercicio_03_aula_36.model.Musica

class DetalheFragment : Fragment() {
//    private lateinit var binding: FragmentDetalheBinding
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentDetalheBinding.inflate(inflater, container, false)
//        return binding.root
//
//        recuperarMusical()
//
//    }
//    private fun recuperarMusical(){
//        val musicaShow = bundle.getParcelableExtra<Musica>(MUSICA_KEY)
//            val musica = arguments?.getParcelable<Musica>(MUSICA_KEY)
//    if(musica != null){
//        binding.ivMusicaImagem.setImageResource(musica.getImagem())
//    }
//        if (musicaShow != null){
//            exibirInformacoes(musicaShow)
//        }
//    }

//    private fun exibirInformacoes(musica: Musica){
//        binding.ivMusicaImagem.setImageResource(musica.getImagem())
//        binding.tvNomeMusicaDetalhe.text = musica.getNome()
//        binding.tvMusicaDescricao.text = musica.getDetalhe()
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == android.R.id.home) {
//            this.finish()
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}