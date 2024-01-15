package com.example.netclanproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.example.netclanproject.databinding.ActivityRefineBinding

class RefineActivity : AppCompatActivity() {
    private val binding : ActivityRefineBinding by lazy {
        ActivityRefineBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            /*startActivity(Intent(this,MainActivity::class.java))
            finish()*/
            onBackPressed()

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }


}