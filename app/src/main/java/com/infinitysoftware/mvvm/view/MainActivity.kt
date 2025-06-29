package com.infinitysoftware.mvvm.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.infinitysoftware.mvvm.ui.theme.MVVMTheme
import com.infinitysoftware.mvvm.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { MainScreen(viewModel = viewModel) }
            }
        }
    }
}