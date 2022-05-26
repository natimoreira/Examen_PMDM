package com.example.moreira_natalia_examen3t.Model

import com.example.moreira_natalia_examen3t.R

/* Clase que contiene la información de los discos.
* Uso de companion object para hacerla "estática"
* https://www.develou.com/objetos-companeros-en-kotlin/
* */
class DiscoProvider {
    companion object{
        val listaDisco : MutableList<DiscoModel> = mutableListOf(
            DiscoModel(
                foto = R.drawable.abbeyroad,
                titulo = "AbbeyRoad",
                artista = "The Beatles",
                id = 0
            ), DiscoModel(
                foto = R.drawable.exileonmainst,
                titulo = "Exile on Main Street",
                artista = "The Rolling Stones",
                id = 1
            ),
            DiscoModel(
                foto = R.drawable.velvetunderground,
                titulo = "The Velvet Underground",
                artista = "The Velvet Underground and Nico",
                id = 2
            ),
            DiscoModel(
                foto = R.drawable.areyouexperienced,
                titulo = "Are You Experienced",
                artista = "Jimi Hendrix",
                id = 3
            ),
            DiscoModel(
                foto = R.drawable.backinblack,
                titulo = "Back in Black",
                artista = "AC/DC",
                id = 4
            ), DiscoModel(
                foto = R.drawable.appetitefordestruction,
                titulo = "Appetite for Destruction",
                artista = "TGuns N’ Roses",
                id = 5
            ),
            DiscoModel(
                foto = R.drawable.ledzeppeliniv,
                titulo = "Led Zeppelin IV",
                artista = "Led Zeppelin",
                id = 6
            )
        )

    }
}