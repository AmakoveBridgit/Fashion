package com.breeapp.fashion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.breeapp.fashion.databinding.ListOfItemsBinding

class FashionAdapter(var fashionList:List<Fashion>) : RecyclerView.Adapter<FashionViewHolder>(){
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FashionViewHolder {
    val binding=ListOfItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return FashionViewHolder(binding)

  }


  override fun onBindViewHolder(holder: FashionViewHolder, position: Int) {
    val clothes=fashionList.get(position)
    var binding=holder.binding
    binding.ivImage.imageAlpha
    binding.ivImage2.imageAlpha


//    binding.ivImage.imageAlpha
//   binding.ivImage3.imageAlpha
//    binding.ivImage4.imageAlpha
//    binding.ivImage5.imageAlpha
//    binding.ivImage6.imageAlpha
//    binding.ivImage7.imageAlpha
//    binding.ivImage8.imageAlpha
    binding.tvName.text=clothes.name
    binding.tvCounty.text=clothes.country
    binding.tvPrice.text=clothes.price

    binding.tvName2.text=clothes.name2
    binding.tvCounty1.text=clothes.country1
    binding.tvPrice1.text=clothes.price1

//    binding.tvName3.text=clothes.name3
//    binding.tvCounty2.text=clothes.country2
//    binding.tvPrice2.text=clothes.price2


  }

  override fun getItemCount(): Int {
    return fashionList.size

  }
}

class FashionViewHolder(var binding:ListOfItemsBinding):RecyclerView.ViewHolder(binding.root)






