@file:OptIn(ExperimentalMaterial3Api::class)
package com.app.misturnos.presentation.home


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun HomeScreen(navController : NavController){
    Scaffold (topBar = {
        TopAppBar(){
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription ="ArrowBak",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text ="Home Screen" )

        }
    }) {
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
        Text(text = "Screen Home")
        Button(onClick = { navController.popBackStack()}) {
            Text(text = "nevagar")
        }
    }
}
/*@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    HomeScreen()
}*/