package pe.idat.ec2_medinaluis

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import pe.idat.ec2_medinaluis.model.Evento


@Composable
fun listado(navController: NavController){
    LazyColumn (verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(listarEventos()){
                evento ->
            itemEvento(evento=evento)


        }


    }

    Column (
        Modifier
            .padding(top = 25.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom) {
        Button(onClick = {
            navController.navigate("inicio")
        }) {
            Text(text = "Guardar")

        }
    }

}


@Composable
fun itemEvento(evento: Evento) {
    Card(
        elevation =CardDefaults.cardElevation(defaultElevation = 6.dp),
        shape = MaterialTheme.shapes.large,
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(id = evento.imagen),
                contentDescription = "",
                modifier = Modifier.width(200.dp).padding(top = 15.dp).height(200.dp),
                contentScale = ContentScale.Crop)
            Column (modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment =Alignment.CenterHorizontally ){
                Text(text = evento.titulo, fontWeight = FontWeight.SemiBold)
                Spacer(modifier =Modifier.height(5.dp) )
                Text(text = evento.descripcion)
                Spacer(modifier =Modifier.height(5.dp) )
                Text(text = evento.fecha)

            }

        }

    }
}


fun listarEventos():List<Evento> {
    return listOf(
        Evento("Evento de Bodas", "Descripción del evento ",
            "2024-01-01", R.drawable.bodas),
        Evento("Evento Escolar", "Descripción del evento ",
            "2024-02-01", R.drawable.escolar),
        Evento("Evento Estudiantil", "Descripción del evento ",
            "2024-03-01", R.drawable.estudiantil),
        Evento("Evento Familiar", "Descripción del evento ",
            "2024-04-01", R.drawable.familiar),
        Evento("Evento Infantil", "Descripción del evento ",
            "2024-05-01", R.drawable.infantil),
        Evento("Evento Minero", "Descripción del evento ",
            "2024-06-01", R.drawable.minero),
        Evento("Evento Natural", "Descripción del evento ",
            "2024-07-01", R.drawable.natural),
        Evento("Evento de Oradores", "Descripción del evento ",
            "2024-08-01", R.drawable.orador),
        Evento("Evento Pop", "Descripción del evento ",
            "2024-09-01", R.drawable.pop),
        Evento("Evento de Rock", "Descripción del evento ",
            "2024-10-01", R.drawable.rock),
        Evento("Evento de Secundarias", "Descripción del evento ",
            "2024-11-01", R.drawable.secundaria),
        Evento("Evento de Solteras", "Descripción del evento ",
            "2024-12-01", R.drawable.solteras),
        )
}






