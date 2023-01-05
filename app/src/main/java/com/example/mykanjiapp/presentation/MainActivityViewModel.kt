package com.example.mykanjiapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mykanjiapp.domain.usecase.GetKanjisByGradeUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val getKanjisByGradeUseCase: GetKanjisByGradeUseCase
) : ViewModel() {
    var data = MutableLiveData<String>()
    fun getKanjis() {
        viewModelScope.launch {
            getKanjisByGradeUseCase.invoke()
                .flowOn(Dispatchers.IO)
                .collect {
                    data.postValue(it.toString())
                }
        }
    }
}

