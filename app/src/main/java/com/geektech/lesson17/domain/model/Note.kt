package com.geektech.lesson17.domain.model

import com.geektech.lesson17.data.model.NoteEntity

data class Note(
    val id: Int = DEFAULT_ID,
    val title: String,
    val description: String,
    val createdAt: Long,
) {
    fun NoteEntity.toNote() = Note(
        id,
        title,
        description,
        createdAt
    )
    fun Note.toEntity() = NoteEntity(
        id,
        title,
        description,
        createdAt
    )

    companion object {
        const val DEFAULT_ID = 0
    }
}