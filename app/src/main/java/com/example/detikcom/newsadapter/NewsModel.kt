package com.example.detikcom.newsadapter

import com.example.detikcom.R

data class news (
    var title:String,
    var desc:String,
    var photo:Int
    )

object NewsModel {

    val newslist = listOf<news>(
        news(
            "Unit Perlawanaan Siber Ukraina Incar Jaringan Listrik dan Kereta Api Rusia",
            "Orang-orang bersenjata berdiri di luar balai kota Kharkiv yang rusak pada 1 Maret 2022, hancur akibat penembakan pasukan Rusia. Alun-alun di pusat kota Kharkiv ditembaki oleh pasukan Rusia yang menyerang gedung pemerintah setempat, kata gubernur regional Oleg Sinegubov. Kharkiv, kota yang sebagian besar berbahasa Rusia di dekat perbatasan Rusia, memiliki populasi sekitar 1,4 juta. (Photo by Sergey BOBOK / AFP)",
            R.drawable.news1
        ),
        news(
            "Rusia Terus Menyerang Kota-kota Ukraina, Biden Ancam Putin dalam Pidatonya",
            "Dilansir CNA, Rabu (2/3/2022), pasukan Rusia bersiap untuk mengintensifkan pemboman mereka di daerah perkotaan dalam upaya menuju ibu kota Kyiv.",
            R.drawable.news2
        ),
        news(
            "Tahan Tensi Geopolitik, Investor Beralih dari Rubel ke Kripto, Harga Bitcoin Melonjak",
            "cryptocurrency masih melanjutkan penguatannya pada sesi perdagangan pagi hari ini, Rabu (2/3/2022). Tren penguatan ini selaras dengan anjloknya mata uang Rusia, rubel.",
            R.drawable.news3
        ),
        news(
            "Hari Ketujuh Invasi: Kyiv Digempur Rudal, Pasukan Terjun Payung Mendarat dan Biden Serang Putin",
            "Petugas Damkar melakukan pemadaman api yang membakar menara pemancar sebuah stasiun televisi di Kyiv yang dibom tentara Rusia, Selasa (1/3/2022).",
            R.drawable.news4
        ),
        news(
            "Perusahaan Pelayaran Maersk dan Hapag Lloyd Hentikan Kiriman Barang ke Pelabuhan Rusia",
            "Invasi Rusia yang semakin masif ke pertahanan militer Ukraina membuat lebih banyak lagi perusahan internasional yang ikut menjatuhkan sanksi ke Rusia.",
            R.drawable.news5
        )
    )

}