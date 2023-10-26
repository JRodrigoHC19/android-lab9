package com.miempresa.androidapp09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.miempresa.androidapp09.viewmodels.CounterViewModel
import com.miempresa.androidapp09.views.Counter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vista = CounterViewModel()
        setContent {
            Counter(viewModel = vista)
        }
    }
}
