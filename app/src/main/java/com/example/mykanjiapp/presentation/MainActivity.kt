package com.example.mykanjiapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mykanjiapp.R
import org.koin.core.component.KoinComponent
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(), KoinComponent {

    private val viewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getKanjis()
        viewModel.data.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }
}