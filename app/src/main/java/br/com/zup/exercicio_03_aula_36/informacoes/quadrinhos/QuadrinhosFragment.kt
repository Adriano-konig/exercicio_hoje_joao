package br.com.zup.exercicio_03_aula_36.informacoes.quadrinhos

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.exercicio_03_aula_36.MUSICA_KEY
import br.com.zup.exercicio_03_aula_36.R
import br.com.zup.exercicio_03_aula_36.databinding.FragmentMusicaBinding
import br.com.zup.exercicio_03_aula_36.databinding.FragmentQuadrinhosBinding
import br.com.zup.exercicio_03_aula_36.detalhe.DetalheActivity
import br.com.zup.exercicio_03_aula_36.informacoes.DetalheFragment
import br.com.zup.exercicio_03_aula_36.informacoes.adapter.MusicaAdapter
import br.com.zup.exercicio_03_aula_36.model.Musica


class QuadrinhosFragment : Fragment() {
  private lateinit var binding: FragmentQuadrinhosBinding
  private lateinit var listaMusica: MutableList<Musica>
  private lateinit var navigation: NavController

//    private val adapter: MusicaAdapter by lazy {
//        MusicaAdapter(arrayListOf(), this::irParaDetalhe)
//    }
  private val adapter:MusicaAdapter by lazy {
      MusicaAdapter(mutableListOf(), this::irParaDetalhe)
  }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuadrinhosBinding.inflate(inflater,container,false)
        return binding.root

       // exibirRecyclerView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigation = Navigation.findNavController(requireView())
        val recyclerView = binding.rvMusica
        adicionarItemListaMusica()

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context,2)

        R.layout.musica_item
    }

//    private fun exibirRecyclerView(){
//        adicionarItemListaMusica()
//        binding.rvMusica.adapter = adapter
//        binding.rvMusica.layoutManager = LinearLayoutManager(this.context)
//    }


    fun adicionarItemListaMusica(){
//        listaMusica = mutableListOf<Musica>()

//        listaMusica.add(
        listaMusica = mutableListOf(
            Musica(
                R.drawable.skank01,
                "skank_1",
                ""
            ),
            Musica(
                R.drawable.skank02,
                "skank_2",
                ""
            ),
            Musica(
                R.drawable.skank03,
                "skank_3",
                ""
            ),
            Musica(
                R.drawable.skank04,
                "skank_4",
                ""
            ),
            Musica(
                R.drawable.skank05,
                "skank_5",
                ""
            ),
            Musica(
                R.drawable.skank06,
                "skank_6",
                ""
            ),
                    )
        adapter.atualizarListaProduto(listaMusica)
    }
    private fun irParaDetalhe(musica: Musica) {
        val bundle = bundleOf(MUSICA_KEY to musica)
//        startActivity(Intent(this.context, DetalheFragment::class.java),bundle)
        navigation.navigate(R.id.action_quadrinhosFragment_to_detalheFragment, bundle)
    }
}