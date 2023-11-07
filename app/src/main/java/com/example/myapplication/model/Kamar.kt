package com.example.myapplication.model
import java.io.Serializable
class Kamar : Serializable{
    lateinit var jenis_kamar: String
    lateinit var tipe_tempat_tidur: String
    lateinit var tarif_awal: String
    lateinit var ukuran_kamar: String
    lateinit var kapasitas_kamar: String
    lateinit var rincian_kamar: String
    lateinit var detail_kamar: String
    var gambar:Int = 0
}