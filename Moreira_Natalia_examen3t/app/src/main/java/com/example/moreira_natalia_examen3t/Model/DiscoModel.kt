package com.example.moreira_natalia_examen3t.Model

/* Clase que solo contiene valores, por eso el data delante de class
* https://www.develou.com/data-classes-en-kotlin/
*/

data class DiscoModel (
    val foto: Int?,
    val titulo: String,
    val artista: String,
    val id: Int
        )