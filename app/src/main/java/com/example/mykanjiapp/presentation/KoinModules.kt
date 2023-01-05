package com.example.mykanjiapp.presentation

import com.example.mykanjiapp.data.api.RetrofitAdapter
import com.example.mykanjiapp.data.datasource.KanjiCloudDataSource
import com.example.mykanjiapp.data.mapper.CharacterMapper
import com.example.mykanjiapp.data.repository.KanjiRepository
import com.example.mykanjiapp.domain.usecase.GetKanjisByGradeUseCase
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    single { RetrofitAdapter.createKanjiApiRetrofit() }
    factory { CharacterMapper() }
    single { KanjiCloudDataSource(kanjiApi = get(), mapper = get()) }
    factory { KanjiRepository(cloudDataSource = get()) }
    factory { GetKanjisByGradeUseCase(repository = get()) }
    viewModelOf(::MainActivityViewModel)
}




