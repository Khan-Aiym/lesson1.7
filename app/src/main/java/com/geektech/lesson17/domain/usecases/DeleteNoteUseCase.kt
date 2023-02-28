package com.geektech.lesson17.domain.usecases

import com.geektech.lesson17.domain.model.Note
import com.geektech.lesson17.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}