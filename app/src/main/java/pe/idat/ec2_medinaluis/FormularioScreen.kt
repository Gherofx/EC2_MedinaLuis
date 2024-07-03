package pe.idat.ec2_medinaluis

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun formulario(navController: NavController){
    var marqueHabilidades by remember { mutableStateOf(listOf<String>()) }
    var significativoTrabajo by remember { mutableStateOf(false) }
    var paganTrabajo by remember { mutableStateOf(false) }
    var bajoPresion by remember { mutableStateOf(true) }
    var oportunidadCrecimiento by remember { mutableStateOf(true) }

    Scaffold(topBar = { MiToolBar()}
    ){
        Column (Modifier.padding(top = 120.dp).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top){

            Text(text = "CUESTIONARIO")

        }
        Spacer(modifier = Modifier.height(16.dp))

        Column (Modifier.padding(top = 25.dp).fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center){

            Text(text = "1. Marque sus habilidades.",style = MaterialTheme.typography.bodySmall)
            CheckboxList(marqueHabilidades, onSelectedItemsChange = { marqueHabilidades = it })

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "2. ¿Cuan significativo es tu trabajo", style = MaterialTheme.typography.bodySmall)
            RadioButtonGroup2(selected = significativoTrabajo, onSelectedChange = { significativoTrabajo= it })

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "3. ¿Que tan bien te pagan en el trabajo que haces?", style = MaterialTheme.typography.bodySmall)
            RadioButtonGroup3(selected = paganTrabajo, onSelectedChange = { paganTrabajo= it })

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "4. ¿Trabajas bajo presion?", style = MaterialTheme.typography.bodySmall)
            RadioButtonGroup(selected = bajoPresion, onSelectedChange = { bajoPresion = it })

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "5. ¿Tienes oportunidad de crecimiento en tu trabajo?", style = MaterialTheme.typography.bodySmall)
            RadioButtonGroup(selected = oportunidadCrecimiento, onSelectedChange = { oportunidadCrecimiento = it })

        }

        Spacer(modifier = Modifier.height(16.dp))


        Column (Modifier.padding(bottom = 50.dp).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom){

            Button(onClick = {
                navController.navigate("inicio")
            }) {
                Text(text = "Resolver")
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiToolBar(){
    TopAppBar(
        title = {
            Text(text = "AppIDAT") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White
        ),
        navigationIcon ={ IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Face,
                contentDescription ="", tint = Color.White )

        }
        })

}


@Composable
fun CheckboxList(selectedItems: List<String>, onSelectedItemsChange: (List<String>) -> Unit) {
    val habilidades = listOf(
        "Autoconocimiento",
        "Empatia",
        "Comunicacion asertiva",
        "Toma de decisiones",
        "Pensamiento critico",
        "Ninguno"
    )

    Column {
        habilidades.forEach { hability ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = selectedItems.contains(hability),
                    onCheckedChange = {
                        val newSelectedItems = if (it) {
                            selectedItems + hability
                        } else {
                            selectedItems - hability
                        }
                        onSelectedItemsChange(newSelectedItems)
                    }
                )
                Text(hability, modifier = Modifier.padding(start = 8.dp))
            }
        }
    }
}

@Composable
fun RadioButtonGroup(selected: Boolean, onSelectedChange: (Boolean) -> Unit) {
    Row {
        RadioButton(
            selected = selected,
            onClick = { onSelectedChange(true) }
        )
        Text("SI")

        RadioButton(
            selected = !selected,
            onClick = { onSelectedChange(false) }
        )
        Text("NO")
    }
}

@Composable
fun RadioButtonGroup2(selected: Boolean, onSelectedChange: (Boolean) -> Unit) {
    Row (){
        RadioButton(
            selected = !selected,
            onClick = { onSelectedChange(false) }
        )
        Text("Mucho")

        RadioButton(
            selected = selected,
            onClick = { onSelectedChange(true) }
        )
        Text("Mas o menos")

        RadioButton(
            selected = selected,
            onClick = { onSelectedChange(true) }
        )
        Text("Poco")
    }
}


@Composable
fun RadioButtonGroup3(selected: Boolean, onSelectedChange: (Boolean) -> Unit) {
    Row {
        RadioButton(
            selected = !selected,
            onClick = { onSelectedChange(true) }
        )
        Text("Bien")

        RadioButton(
            selected = selected,
            onClick = { onSelectedChange(false) }
        )
        Text("Regular")

        RadioButton(
            selected = selected,
            onClick = { onSelectedChange(true) }
        )
        Text("Mal")
    }
}