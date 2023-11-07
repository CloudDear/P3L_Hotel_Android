package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Kamar

class AdapterKamar (var data:ArrayList<Kamar>):RecyclerView.Adapter<AdapterKamar.Holder>() {

    class Holder(view: View):RecyclerView.ViewHolder(view){
        val tvJenisKamar = view.findViewById<TextView>(R.id.tv_jenis_kamar)
        val tvTarifAwal = view.findViewById<TextView>(R.id.tv_tarif_awal)
        val imgKamar = view.findViewById<ImageView>(R.id.img_kamar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kamar, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvJenisKamar.text = data[position].jenis_kamar
        holder.tvTarifAwal.text = data[position].tarif_awal
        holder.imgKamar.setImageResource(data[position].gambar)
    }

}