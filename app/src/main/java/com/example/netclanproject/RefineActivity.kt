package com.example.netclanproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import com.example.netclanproject.databinding.ActivityRefineBinding

class RefineActivity : AppCompatActivity() {
    private val binding: ActivityRefineBinding by lazy {
        ActivityRefineBinding.inflate(layoutInflater)
    }

    // private val WORD_LIMIT = 250
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

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