package com.geektech.lesson17.data.repository

import android.provider.ContactsContract
import com.example.homework1_7.data.mappers.toNote
import com.geektech.lesson17.data.local.NoteDao
import com.geektech.lesson17.domain.model.Note

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository{

    override fun createNote(note: Note) {
        noteDao.createNote(note.toNoteEntity())
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toNoteEntity())

    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toNoteEntity())

    }
    override fun getNotes(): List<Note> {
        return noteDao.getNotes().map{ it.toNote()}
    }
}