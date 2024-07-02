package pe.idat.ec2_medinaluis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


import androidx.navigation.compose.rememberNavController
import pe.idat.ec2_medinaluis.ui.theme.EC2_MedinaLuisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC2_MedinaLuisTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "inicio",
                    builder = {
                        composable("inicio"){
                            inicio(navController)
                        }
                        composable("registro"){
                            registro(navController)
                        }
                        composable("formulario"){
                            formulario(navController)
                        }
                        composable("listado") {
                            listado(navController)
                        }

                    })


            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EC2_MedinaLuisTheme {

    }
}