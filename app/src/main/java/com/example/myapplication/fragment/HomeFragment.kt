package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.myapplication.R
import com.example.myapplication.adapter.AdapterKamar
import com.example.myapplication.adapter.AdapterSlider
import com.example.myapplication.model.Kamar

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var vpSlider: ViewPager

    lateinit var rvKamar: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvKamar = view.findViewById(R.id.rv_kamar)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider= AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        rvKamar.adapter = AdapterKamar(arrKamar)
        rvKamar.layoutManager = layoutManager

        return view
    }

    val arrKamar: ArrayList<Kamar>get() {
        var arr = ArrayList<Kamar>()
        val k1 = Kamar()
        val k2 = Kamar()
        val k3 = Kamar()
        k1.jenis_kamar = "Deluxe"
        k1.tipe_tempat_tidur = "King"
        k1.tarif_awal = "200000"
        k1.ukuran_kamar= "4 X 10"
        k1.kapasitas_kamar= "2"
        k1.rincian_kamar= "Free Wifi"
        k1.detail_kamar= "Water Heater"
        k1.gambar = R.drawable.slider1

        k2.jenis_kamar = "Deluxe"
        k2.tipe_tempat_tidur = "King"
        k2.tarif_awal = "200000"
        k2.ukuran_kamar= "4 X 10"
        k2.kapasitas_kamar= "2"
        k2.rincian_kamar= "Free Wifi"
        k2.detail_kamar= "Water Heater"
        k2.gambar = R.drawable.slider1

        k3.jenis_kamar = "Deluxe"
        k3.tipe_tempat_tidur = "King"
        k3.tarif_awal = "200000"
        k3.ukuran_kamar= "4 X 10"
        k3.kapasitas_kamar= "2"
        k3.rincian_kamar= "Free Wifi"
        k3.detail_kamar= "Water Heater"
        k3.gambar = R.drawable.slider1

        arr.add(k1)
        arr.add(k2)
        arr.add(k3)
        return arr
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}