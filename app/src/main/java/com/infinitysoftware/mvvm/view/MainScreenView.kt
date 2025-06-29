package com.infinitysoftware.mvvm.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.infinitysoftware.mvvm.viewmodel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {
    val user = viewModel.currentUser.value

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "User name: ${user.name}")
        Text(text = "User age: ${user.age}")

        Button(
            onClick = { viewModel.changeUser("Jane Smith", 25) },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Change User")
        }
    }
}
