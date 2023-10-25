package com.miempresa.androidapp09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val testViewModel = CounterViewModel()
    Counter(viewModel = testViewModel)
}