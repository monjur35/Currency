package com.example.currency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var viewModelss:ViewModelss
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelss=ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(ViewModelss::class.java)

        viewModelss.data.observe(this, Observer {
            if (it.success){
                Toast.makeText(this,it.currencies.AED,Toast.LENGTH_LONG).show()
            }
        })
    }
}