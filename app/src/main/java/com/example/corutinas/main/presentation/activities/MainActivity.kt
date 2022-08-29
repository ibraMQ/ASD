package com.example.corutinas.main.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.corutinas.R
import com.example.corutinas.main.presentation.viewmodel.MainViewModel
import java.net.CacheResponse

//main
class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initActions()
        initObservers()
    }

    private fun initActions(){
        viewModel.requestData()
    }
    private fun initObservers(){
        viewModel.requestData.observe(this, ::handleData)
    }
    private fun handleData(response: String){

    }
}