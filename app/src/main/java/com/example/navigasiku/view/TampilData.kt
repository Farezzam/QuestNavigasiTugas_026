package com.example.navigasiku.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

data class FormData(
    val nama: String,
    val gender: String,
    val status: String,
    val alamat: String
)

val datalist = listOf(
    FormData(
        nama = "Blecky",
        gender = "Laki - Laki",
        status = "Cerai",
        alamat = "Sleman"
    ),
    FormData(
        nama = "Juliana",
        gender = "Perempuan",
        status = "Lajang",
        alamat = "Bantul"
    ),
    FormData(
        nama = "Broddy ",
        gender = "Laki - Laki",
        status = "Kawin",
        alamat = "Jogja"
    ),
    FormData(
        nama = "Guz Gutsman",
        gender = "Laki - Laki",
        status = "Lajang",
        alamat = "Sleman"
    ),
    FormData(
        nama = "Lembud",
        gender = "Laki - Laki",
        status = "Lajang",
        alamat = "Gunung Kidul"
    ),
    FormData(
        nama = "Tiaraa",
        gender = "Perempuan",
        status = "Kawin",
        alamat = "Banguntapan"
    ),
    FormData(
        nama = "Nisa",
        gender = "Perempuan",
        status = "Cerai",
        alamat = "Kasihan"
    )
)

@Composable
fun TampilData(navController: NavHostController) {
    val pesertaList = datalist

    val gradient = Brush.verticalGradient(
        colors = listOf(Color(0xFF313647), Color(0xFF1A3D64))
    )