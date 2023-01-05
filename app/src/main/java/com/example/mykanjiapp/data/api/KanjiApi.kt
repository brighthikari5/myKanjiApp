package com.example.mykanjiapp.data.api

import retrofit2.http.GET

interface KanjiApi {

    @GET("grade-1")
    suspend fun getGradeOneKanjis(): List<String>
}