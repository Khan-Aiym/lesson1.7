package com.geektech.lesson17.domain.usecases

import com.geektech.lesson17.domain.model.Note
import com.geektech.lesson17.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor (
    private val noteRepository: NoteRepository
) {

    fun editNote(note: Note) = noteRepository.editNote(note)
}