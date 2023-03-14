package com.geektech.lesson17.domain.usecases

import com.geektech.lesson17.domain.model.Note
import com.geektech.lesson17.domain.repository.NoteRepository
import javax.inject.Inject

class CreateNoteUseCase @Inject constructor (
    private val noteRepository: NoteRepository
) {

    fun createNote(note: Note) = noteRepository.createNote(note)
}