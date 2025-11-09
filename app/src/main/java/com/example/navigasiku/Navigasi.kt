package com.example.navigasiku

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasiku.view.Dasboard

enum class Navigasi {
    Dasboard,
    Formulir,
    TampilData
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Navigasi.Dasboard.name
    ) {
        composable(route = Navigasi.Dasboard.name) {
            Dasboard(navController = navController)
        }
        composable(route = Navigasi.Formulir.name) {
            Formulir(navController = navController)
        }
        composable(route = Navigasi.TampilData.name) {
            TampilData(navController = navController)
        }
    }
}