package com.example.netclanproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netclanproject.Adapter.BusinessAdapter
import com.example.netclanproject.Adapter.MerchantAdapter
import com.example.netclanproject.Adapter.UserAdapter
import com.example.netclanproject.R
import com.example.netclanproject.databinding.FragmentBusinessBinding
import com.example.netclanproject.databinding.FragmentMerchantBinding
import com.example.netclanproject.model.MerchantData
import com.example.netclanproject.model.UserData

class MerchantFragment : Fragment() {

    private val binding : FragmentMerchantBinding by lazy {
        FragmentMerchantBinding.inflate(layoutInflater)
    }

    private var itemList = ArrayList<MerchantData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        itemList.add(MerchantData("Brown Bites","Noida, Within 200 m","Hi community! We have greate deals for you. Check us out!!",R.drawable.cafe))
        itemList.add(MerchantData("24SEVEN","Noida, Within 700 m","Hi community! We have greate deals for you. Check us out!!",R.drawable.seven24))
        itemList.add(MerchantData("Helly & Chilly Cafe","Noida, Within 500 m","Hi community! We have greate deals for you. Check us out!!",R.drawable.helly_cafe))
        itemList.add(MerchantData("Richa's Home","Noida, Within 100 m","Hi community! We have greate deals for you. Check us out!!",R.drawable.building))

        binding.recyclerViewMerchant.layoutManager = LinearLayoutManager(requireContext())
        var adapter = MerchantAdapter(itemList)
        binding.recyclerViewMerchant.adapter = adapter
        binding.recyclerViewMerchant.setHasFixedSize(true)
    }

}