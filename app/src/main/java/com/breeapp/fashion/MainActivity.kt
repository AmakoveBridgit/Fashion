package com.breeapp.fashion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.breeapp.fashion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayFashion()
1
    }
    fun displayFashion(){
        var fashion1=Fashion("Brown","Ethiopia","$200","Pink","Kenya",
            "$300")

//            "Bree","Uganda","$310")
//            "Willow","Pakistan",
//            "$200","Shazzy","Kenya","$300","Abbula","Rwanda",
//            "$200","Shiko","Rwanda","$200","Mula","Kenya",
//            "$200")
//        var fashion2=Fashion("Meghan","Turkey","$250")
//        var fashion3=Fashion("Bree","Kenya","$300")
//        var fashion4=Fashion("Halima","Congo","$100")
//        var fashion5=Fashion("Amakove","Mexico","$150")
//        var fashion6=Fashion("Judith","USA","$300")
//        var fashion7=Fashion("Kate","Burundi","$380")
//        var fashion8=Fashion("Shazy","Canada","$300")

        val fashionList= listOf(fashion1)
        val fashionAdapter=FashionAdapter(fashionList)
        binding.rvFashion.layoutManager=LinearLayoutManager(this)
        binding.rvFashion.adapter=fashionAdapter
    }
}






