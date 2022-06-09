package br.com.zup.exercicio_03_aula_36.informacoes.musica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.exercicio_03_aula_36.databinding.FragmentMusicaBinding


class MusicaFragment : Fragment() {

   private lateinit var binding: FragmentMusicaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMusicaBinding.inflate(inflater, container, false)
    return binding.root
    }
}