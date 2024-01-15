package com.example.netclanproject.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netclanproject.R
import com.example.netclanproject.databinding.CardItemBinding
import com.example.netclanproject.model.UserData

class UserAdapter(private val userList: ArrayList<UserData>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(var binding : CardItemBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(CardItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var dataList = userList[position]
        holder.binding.name.text = dataList.userName
        holder.binding.address.text = dataList.userLocation
        holder.binding.distance.text = dataList.distance
       // holder.binding.imageView.resources.getDrawable() = dataList.image
    }
}