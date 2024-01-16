package com.example.netclanproject.Fragment

import android.R.attr.x
import android.R.attr.y
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netclanproject.Adapter.UserAdapter
import com.example.netclanproject.R
import com.example.netclanproject.databinding.FragmentPersonalBinding
import com.example.netclanproject.model.UserData


class PersonalFragment : Fragment() {
   private val binding : FragmentPersonalBinding by lazy {
       FragmentPersonalBinding.inflate(layoutInflater)
   }
    private var itemList = ArrayList<UserData>()


   /* override fun onCreate(savedInstanceState: Bundle?) {
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
        itemList.add(UserData("Deepak Khatana","Noida | Android Developer","Within 120 m",R.drawable.profile7))
        itemList.add(UserData("Shiva Bhadana","Gr. Noida | Engineering","Within 10 Km",R.drawable.profile2))
        itemList.add(UserData("Pranshi Saini","Meerut | Software Developer","Within 60 km",R.drawable.profile4))
        itemList.add(UserData("Vikas Gurjar","Meerut | Developer","Within 65 km m",R.drawable.profile3))
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        var adapter = UserAdapter(itemList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)

    }

}




