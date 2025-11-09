package com.example.navigasiku.view

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