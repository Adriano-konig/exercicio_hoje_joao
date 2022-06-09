package br.com.zup.exercicio_03_aula_36.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Musica (
    private var imagem:Int,
    private var nome:String,
    private var detalhe: String
        ):Parcelable{
    fun getImagem()=this.imagem
    fun getNome()=this.nome
    fun getDetalhe()=this.detalhe
}