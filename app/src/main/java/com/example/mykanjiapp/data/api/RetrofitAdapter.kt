package com.example.mykanjiapp.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitAdapter {

    fun createKanjiApiRetrofit(): KanjiApi = Retrofit.Builder()
        .baseUrl(ApiConstants.BASE_URL)
        .client(OkHttpClient.createOkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(KanjiApi::class.java)
}