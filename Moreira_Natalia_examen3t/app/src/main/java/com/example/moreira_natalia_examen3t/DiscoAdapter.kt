package com.example.moreira_natalia_examen3t

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/* Aquí implementamos los 3 métodos que nos pide */
class DiscoAdapter (private val listaDiscoModel: List<DiscoModel>): RecyclerView.Adapter<DiscoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DiscoViewHolder(layoutInflater.inflate(R.layout.disco, parent, false))
    }

    override fun onBindViewHolder(holder: DiscoViewHolder, position: Int) {
        val item = listaDiscoModel[position]
        holder.render(item)

        // esto es para cambiar el color del fondo de cada caja de información del disco
        with(holder){
            if(position % 2 == 0){
                binding.fondoUno.setBackgroundColor(Color.CYAN)
            }else{
                binding.fondoUno.setBackgroundColor(Color.BLUE)
            }
        }
    }
    // Reducimos este método
    override fun getItemCount(): Int = listaDiscoModel.size
}
