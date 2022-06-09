package br.com.zup.exercicio_03_aula_36.informacoes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.exercicio_03_aula_36.databinding.MusicaItemBinding
import br.com.zup.exercicio_03_aula_36.model.Musica

class MusicaAdapter(
    private var listaMusica: MutableList<Musica>,
    private var clickMusica:(musica: Musica) -> Unit
):RecyclerView.Adapter<MusicaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val binding = MusicaItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val musicaShow = listaMusica[position]
        holder.adicionarInformacoesView(musicaShow)
        holder.binding.cvItemLista.setOnClickListener{
            clickMusica(musicaShow)
        }
    }

    override fun getItemCount(): Int = listaMusica.size


    fun atualizarListaProduto(novaLista: MutableList<Musica>) {
        if (listaMusica.size == 0) {
            listaMusica = novaLista
        } else {
            listaMusica.addAll(novaLista)
        }
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: MusicaItemBinding):RecyclerView.ViewHolder(binding.root){
        fun adicionarInformacoesView(musica: Musica){
            binding.ivSkank.setImageResource(musica.getImagem())
        }
    }
}