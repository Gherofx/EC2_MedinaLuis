package pe.idat.ec2_medinaluis

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun inicio(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(painter = painterResource(id = R.drawable.mundo),
            contentDescription = "Logo")

        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "REGISTRO")
            
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "FORMULARIO")
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "LISTADO")
        }
    }
}