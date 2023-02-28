package com.geektech.lesson17.domain.usecases

import com.geektech.lesson17.domain.model.Note
import com.geektech.lesson17.domain.repository.NoteRepository

class EditNoteUseCase (
    private val noteRepository: NoteRepository
) {

    fun editNote(note: Note) = noteRepository.editNote(note)
}