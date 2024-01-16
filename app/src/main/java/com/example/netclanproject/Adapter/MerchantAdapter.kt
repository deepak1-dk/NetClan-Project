package com.example.netclanproject.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanproject.databinding.BusinessCardItemBinding
import com.example.netclanproject.databinding.MerchantCardItemBinding
import com.example.netclanproject.model.BusinessData
import com.example.netclanproject.model.MerchantData

class MerchantAdapter(private val userList: ArrayList<MerchantData>) :
    RecyclerView.Adapter<MerchantAdapter.MerchantViewHolder>(){

    class MerchantViewHolder(var binding : MerchantCardItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MerchantViewHolder {
        return MerchantViewHolder(MerchantCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return  userList.size
    }

    override fun onBindViewHolder(holder: MerchantViewHolder, position: Int) {
        var dataList = userList[position]
        holder.binding.nameMerchantCard.text = dataList.userName
        holder.binding.addressMerchantCard.text = dataList.userLocation
        holder.binding.statusMerchant.text = dataList.status
        holder.binding.imageViewMerchant.setImageResource(dataList.image)

    }


}