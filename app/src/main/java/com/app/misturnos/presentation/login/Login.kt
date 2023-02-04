@file:OptIn(ExperimentalMaterial3Api::class)
package com.app.misturnos.presentation.login


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.app.misturnos.navigation.Destination


@Composable
fun LoginScreen(navController : NavController){
    Scaffold {
        BodyContent(navController)
    }
}
@Composable
fun BodyContent(navController : NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen Login")
        Button(onClick = {
            navController.navigate(route = Destination.Home.route)
        }) {
            Text(text = "nevagar")
        }
    }
}
/*@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
   LoginScreen()
}*/