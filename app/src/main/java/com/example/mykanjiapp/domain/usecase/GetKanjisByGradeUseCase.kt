package com.example.mykanjiapp.domain.usecase

import com.example.mykanjiapp.data.repository.KanjiRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

class GetKanjisByGradeUseCase(private val repository: KanjiRepository) {
    suspend operator fun invoke() =
        flow<KanjiResult> {
            emit(KanjiResult.Success(repository.downloadKanjisByGrade()))
        }.catch {
            emit(KanjiResult.Failure((it.message ?: "")))
        }
}

sealed class KanjiResult {
    data class Success<T>(val result: T) : KanjiResult()
    data class Failure<T>(val result: T) : KanjiResult()
}