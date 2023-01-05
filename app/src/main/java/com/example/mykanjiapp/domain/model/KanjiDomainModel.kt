package com.example.mykanjiapp.domain.model

data class KanjiDomainModel(
    val character: String,
    val grade: String? = "",
    val strokeCount: Int? = 0,
    val meanings: List<String>? = emptyList(),
    val heisigEn: String? = "",
    val kunReadings: List<String>? = emptyList(),
    val onReadings: List<String>? = emptyList(),
    val namReadings: List<String>? = emptyList(),
    val nameReadings: List<String>? = emptyList(),
    val jlpt: Int? = 0,
    val unicode: String? = ""
)

