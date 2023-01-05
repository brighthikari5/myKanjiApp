package com.example.mykanjiapp.data.datasource

import com.example.mykanjiapp.data.mapper.CharacterMapper
import com.example.mykanjiapp.data.api.KanjiApi
import com.example.mykanjiapp.domain.model.KanjiDomainModel

class KanjiCloudDataSource(
    private val kanjiApi: KanjiApi,
    private val mapper: CharacterMapper
) {
    suspend fun getKanjis(): List<KanjiDomainModel> =
        kanjiApi.getGradeOneKanjis()
            .let { mapper.toDomain(it) }
}