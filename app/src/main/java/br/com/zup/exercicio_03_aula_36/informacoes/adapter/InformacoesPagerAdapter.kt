package br.com.zup.exercicio_03_aula_36.informacoes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.exercicio_03_aula_36.informacoes.musica.MusicaFragment
import br.com.zup.exercicio_03_aula_36.informacoes.quadrinhos.QuadrinhosFragment

class InformacoesPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private var listaTitulos: List<String>
): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return listaTitulos.size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return MusicaFragment()
            1 -> return QuadrinhosFragment()
        }
        return MusicaFragment()
    }

}