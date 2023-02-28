package com.geektech.lesson17.domain.model

import com.geektech.lesson17.data.model.NoteEntity

class Note (
    val id: Int = DEFAULT_ID,
    val title: String,
    val description: String,
    val createdAt: Long
) {
    fun toNoteEntity(): NoteEntity {

    }

    companion object{
        const val DEFAULT_ID = 0
    }
}