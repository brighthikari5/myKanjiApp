package com.example.mykanjiapp.data.api

import retrofit2.http.GET

interface KanjiApi {

    @GET("grade-1")
    suspend fun getGradeOneKanjis(): List<String>

    @GET("grade-2")
    suspend fun getGradeTwoKanjis(): List<String>

    @GET("grade-3")
    suspend fun getGradeThreeKanjis(): List<String>

    @GET("grade-4")
    suspend fun getGradeFourKanjis(): List<String>

    @GET("grade-5")
    suspend fun getGradeFiveKanjis(): List<String>

    @GET("grade-6")
    suspend fun getGradeSixKanjis(): List<String>

}