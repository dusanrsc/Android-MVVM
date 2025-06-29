package com.infinitysoftware.mvvm.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.infinitysoftware.mvvm.model.UserModel

class MainViewModel : ViewModel() {
    var currentUser = mutableStateOf(UserModel("John Doe", 30))
        private set

    fun changeUser(name: String, age: Int) {
        currentUser.value = UserModel(name, age)
    }
}
