package com.geektech.lesson17.domain.usecases

import com.geektech.lesson17.domain.repository.NoteRepository

class GetNotesUseCase (
    private val noteRepository: NoteRepository
){
    fun getNotes() = noteRepository.getNotes()
}