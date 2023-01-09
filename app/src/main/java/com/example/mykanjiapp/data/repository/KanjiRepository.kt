package com.example.mykanjiapp.data.repository

import com.example.mykanjiapp.data.datasource.KanjiCloudDataSource
import com.example.mykanjiapp.domain.model.KanjiDomainModel

class KanjiRepository(private val cloudDataSource: KanjiCloudDataSource) {

    suspend fun downloadKanjisByGrade(): List<KanjiDomainModel> =
        cloudDataSource.getGradeOneKanjis()
}