package com.geektech.lesson17.data.local

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import com.geektech.lesson17.data.model.NoteEntity

interface NoteDao {
    fun createNote(noteEntity: NoteEntity)

    @Update
    fun editNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    fun getNotes(): List<NoteEntity>
}