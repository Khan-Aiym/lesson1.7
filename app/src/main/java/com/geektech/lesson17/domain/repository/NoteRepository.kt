package com.geektech.lesson17.domain.repository

import com.geektech.lesson17.domain.model.Note


interface NoteRepository {

    fun createNote(note: Note)

    fun editNote(note: Note)

    fun deleteNote(note: Note)

    fun getNotes(): List<Note>
}