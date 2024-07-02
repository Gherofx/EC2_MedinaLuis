package pe.idat.ec2_medinaluis.model

import androidx.annotation.DrawableRes

data class Evento(
    var titulo: String,
    var descripcion: String,
    var fecha: String,
    @DrawableRes var imagen: Int

)
