package com.example.netclanproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        itemList.add(UserData("Deepak","Noida | Android Developer","Within 120 m",R.drawable.english1))
        itemList.add(UserData("Shiva","Gr. Noida | Engineering","Within 10 Km",R.drawable.english1))
        itemList.add(UserData("Pranshi","Meerut | Software Developer","Within 60 km",R.drawable.english1))
        itemList.add(UserData("Vikas","Meerut | Developer","Within 65 km m",R.drawable.english1))
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        var adapter = UserAdapter(itemList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }

}