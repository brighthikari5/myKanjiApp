package com.example.mykanjiapp.data.model

import com.google.gson.annotations.SerializedName

data class KanjiApiModel(
    @SerializedName("kanji")
    val kanji: String,
    val grade: Int,
    val stroke_count: Int,
    val meanings: List<String>,
    val kun_readings: List<String>,
    @SerializedName("on_readings")
    val onReadings: List<String>,
    val name_readings: List<String>,
    val jlpt: Int,
    val unicode: String,
    val heisig_en: String
)
