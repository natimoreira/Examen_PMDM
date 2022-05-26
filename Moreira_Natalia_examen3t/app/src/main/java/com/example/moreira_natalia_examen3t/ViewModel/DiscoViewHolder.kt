package com.example.moreira_natalia_examen3t.ViewModel

import android.app.AlertDialog
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moreira_natalia_examen3t.Model.DiscoModel
import com.example.moreira_natalia_examen3t.R
import com.example.moreira_natalia_examen3t.databinding.DiscoBinding

/* Vista */
class DiscoViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val binding = DiscoBinding.bind(view)

    fun render(modelo: DiscoModel){
        // Seleccionamos cada información del disco del modelo (DiscoModel)
        binding.imgCaratula.setImageResource(modelo.foto ?: R.drawable.ic_launcher_background)
        binding.textAlbum.text = modelo.titulo
        binding.textArtista.text = modelo.artista

        // botón info
        binding.btnInfo.setOnClickListener{
            AlertDialog.Builder(binding.root.context).setMessage(modelo.titulo).
            setTitle("Artista: " + modelo.artista).create().show()

        }
    }
}