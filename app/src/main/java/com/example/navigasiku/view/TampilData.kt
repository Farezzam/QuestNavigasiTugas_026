package com.example.navigasiku.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradient)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "List Daftar Peserta",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))
            LazyColumn (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                items(items = pesertaList) { peserta ->
                    PesertaCard(peserta = peserta)
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
