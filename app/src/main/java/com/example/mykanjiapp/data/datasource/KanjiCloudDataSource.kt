package com.example.mykanjiapp.data.datasource

import com.example.mykanjiapp.data.mapper.CharacterMapper
import com.example.mykanjiapp.data.api.KanjiApi
import com.example.mykanjiapp.domain.model.KanjiDomainModel

class KanjiCloudDataSource(
    private val kanjiApi: KanjiApi,
    private val mapper: CharacterMapper
) {
    suspend fun getGradeOneKanjis(): List<KanjiDomainModel> =
        kanjiApi.getGradeOneKanjis()
            .let { mapper.toDomain(it) }

    suspend fun getGradeTwoKanjis(): List<KanjiDomainModel> =
        kanjiApi.getGradeTwoKanjis()
            .let { mapper.toDomain(it) }

    suspend fun getGradeThreeKanjis(): List<KanjiDomainModel> =
        kanjiApi.getGradeThreeKanjis()
            .let { mapper.toDomain(it) }

    suspend fun getGradeFourKanjis(): List<KanjiDomainModel> =
        kanjiApi.getGradeFourKanjis()
            .let { mapper.toDomain(it) }

    suspend fun getGradeFiveKanjis(): List<KanjiDomainModel> =
        kanjiApi.getGradeFiveKanjis()
            .let { mapper.toDomain(it) }

    suspend fun getGradeSixKanjis(): List<KanjiDomainModel> =
        kanjiApi.getGradeSixKanjis()
            .let { mapper.toDomain(it) }

}