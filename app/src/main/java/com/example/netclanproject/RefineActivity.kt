package com.example.netclanproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.netclanproject.databinding.ActivityRefineBinding

class RefineActivity : AppCompatActivity() {
    private val binding: ActivityRefineBinding by lazy {
        ActivityRefineBinding.inflate(layoutInflater)
    }

    val availability = arrayOf("Available | Hey Let Us Connect","Away | Stay Discrete And Watch",
        "Busy | Bo Not Disturb Will Catch Up Later","SOS | Emergency! Need Assistance! HELP")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,availability)
        binding.spinner.adapter = arrayAdapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        binding.backButton.setOnClickListener {
            onBackPressed()
        }



        binding.inputText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var data : String = binding.inputText.text.toString()
                var length : Int? = (data as? String)?.length

                binding.count.text = length.toString()
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })


    }
}