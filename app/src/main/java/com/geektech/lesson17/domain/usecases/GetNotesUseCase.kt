package com.geektech.lesson17.domain.usecases

import com.geektech.lesson17.domain.repository.NoteRepository
import javax.inject.Inject

class GetNotesUseCase @Inject constructor (
    private val noteRepository: NoteRepository
){
    fun getNotes() = noteRepository.getNotes()
}