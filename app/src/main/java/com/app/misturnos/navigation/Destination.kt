package com.app.misturnos.navigation

sealed class Destination(val route: String){
    object Login : Destination("login")
    object Home: Destination("home")
}
