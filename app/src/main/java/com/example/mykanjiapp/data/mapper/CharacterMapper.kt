package com.example.mykanjiapp.data.mapper

import com.example.mykanjiapp.domain.model.KanjiDomainModel

class CharacterMapper {
    fun toDomain(characterList: List<String>): List<KanjiDomainModel> =
        characterList.map { KanjiDomainModel(it) }
}