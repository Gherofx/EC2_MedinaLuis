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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun formulario(navController: NavController){

    Scaffold(topBar = { MiToolBar()}
    ){

    }

    Column (Modifier.padding(top = 25.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){

        Text(text = "CUESTIONARIO")
        Spacer(modifier = Modifier.height(16.dp))



       Button(onClick = {
           navController.navigate("inicio")
       }) {
           Text(text = "Resolver")

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

