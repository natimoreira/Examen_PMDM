package com.example.moreira_natalia_examen3t

/* Clase que contiene la información de los discos.
* Uso de companion object para hacerla "estática"
* https://www.develou.com/objetos-companeros-en-kotlin/
* */
class DiscoProvider {
    companion object{
        val listaDisco = listOf<DiscoModel>(
            DiscoModel(
                foto = R.drawable.abbeyroad,
                titulo = "AbbeyRoad",
                artista = "The Beatles"
            ),DiscoModel(
                foto = R.drawable.exileonmainst,
                titulo = "Exile on Main Street",
                artista = "The Rolling Stones"
            ),
            DiscoModel(
                foto = R.drawable.velvetunderground,
                titulo = "The Velvet Underground",
                artista = "The Velvet Underground and Nico"
            ),
            DiscoModel(
                foto = R.drawable.areyouexperienced,
                titulo = "Are You Experienced",
                artista = "Jimi Hendrix"
            ),
            DiscoModel(
                foto = R.drawable.backinblack,
                titulo = "Back in Black",
                artista = "AC/DC"
            ),DiscoModel(
                foto = R.drawable.appetitefordestruction,
                titulo = "Appetite for Destruction",
                artista = "TGuns N’ Roses"
            ),
            DiscoModel(
                foto = R.drawable.ledzeppeliniv,
                titulo = "Led Zeppelin IV",
                artista = "Led Zeppelin"
            )
        )

    }
}