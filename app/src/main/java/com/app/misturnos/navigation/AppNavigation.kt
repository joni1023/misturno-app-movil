package com.app.misturnos.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost


import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.app.misturnos.presentation.home.HomeScreen
import com.app.misturnos.presentation.login.LoginScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.Login.route ){
        composable(Destination.Login.route) {
            LoginScreen(navController)
        }
        composable(Destination.Home.route) {
            HomeScreen(navController) }
    }
}