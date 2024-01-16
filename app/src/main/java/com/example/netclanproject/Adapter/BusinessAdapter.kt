package com.example.netclanproject.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanproject.databinding.BusinessCardItemBinding
import com.example.netclanproject.databinding.CardItemBinding
import com.example.netclanproject.model.BusinessData

class BusinessAdapter(private val userList: ArrayList<BusinessData>) :
    RecyclerView.Adapter<BusinessAdapter.BusinessViewHolder>(){

    class BusinessViewHolder(var binding : BusinessCardItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusinessViewHolder {
        return BusinessViewHolder(BusinessCardItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return  userList.size
    }

    override fun onBindViewHolder(holder: BusinessViewHolder, position: Int) {
        var dataList = userList[position]
        holder.binding.nameBusinessCard.text = dataList.userName
        holder.binding.addressBusinessCard.text = dataList.userLocation
        holder.binding.PurposeBusiness.text = dataList.purpose
        holder.binding.statusBusiness.text = dataList.status
        holder.binding.imageViewBusiness.setImageResource(dataList.image)
    }
}