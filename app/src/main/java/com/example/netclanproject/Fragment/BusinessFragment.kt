package com.example.netclanproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netclanproject.Adapter.BusinessAdapter
import com.example.netclanproject.Adapter.UserAdapter
import com.example.netclanproject.R
import com.example.netclanproject.databinding.FragmentBusinessBinding
import com.example.netclanproject.databinding.FragmentPersonalBinding
import com.example.netclanproject.model.BusinessData
import com.example.netclanproject.model.UserData

class BusinessFragment : Fragment() {

    private val binding : FragmentBusinessBinding by lazy {
        FragmentBusinessBinding.inflate(layoutInflater)
    }
    private var itemList = ArrayList<BusinessData>()

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }*/

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
        itemList.add(BusinessData("Jai Singh","Noida Within 120 m","Engineer | 1 Year of experience","Hi community! I am available at your service!"))
        itemList.add(BusinessData("Vikarm Gupta","Gr. Noida Within 10 Km","UI & UX Designer | 2 Years of experience","Hi community! I am available at your service!"))
        itemList.add(BusinessData("Dev Tomar","Noida Within 1 Km","Wedding Planner | 2 Years of experience","Hi community! I am available at your service!"))
        itemList.add(BusinessData("Vikas Khatana","Noida Within 2 Km","Android Developer | 1 Year of experience","Hi community! I am available at your service!"))

        binding.recyclerViewBusiness.layoutManager = LinearLayoutManager(requireContext())
        var adapter = BusinessAdapter(itemList)
        binding.recyclerViewBusiness.adapter = adapter
        binding.recyclerViewBusiness.setHasFixedSize(true)


    }

}