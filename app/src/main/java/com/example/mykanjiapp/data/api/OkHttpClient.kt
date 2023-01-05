package com.example.mykanjiapp.data.api

import com.example.mykanjiapp.BuildConfig
import java.util.concurrent.TimeUnit
import okhttp3.Interceptor
import okhttp3.OkHttpClient.*
import okhttp3.logging.HttpLoggingInterceptor

object OkHttpClient {

    fun createOkHttpClient() = Builder()
        .addInterceptor(getLoginInterceptor())
        .connectTimeout(ApiConstants.TIMEOUT_CONNECTION_VALUE, TimeUnit.SECONDS)
        .readTimeout(ApiConstants.TIMEOUT_READ_VALUE, TimeUnit.SECONDS)
        .writeTimeout(ApiConstants.TIMEOUT_WRITE_VALUE, TimeUnit.SECONDS)
        .build()

    private fun getLoginInterceptor(): Interceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG) {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        } else {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
        }
        return httpLoggingInterceptor
    }

}