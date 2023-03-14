package com.geektech.lesson17.data.repository

import com.example.homework1_7.data.mappers.toNote
import com.example.homework1_7.data.mappers.toNoteEntity
import com.geektech.lesson17.data.local.NoteDao
import com.geektech.lesson17.domain.model.Note
import com.geektech.lesson17.domain.repository.NoteRepository
import com.geektech.lesson17.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
import javax.inject.Inject


class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao,
) : NoteRepository {

    override fun createNote(note: Note) = flow {
        emit(Resource.Loading())
        try {
            val data = noteDao.createNote(note.toNoteEntity())
            emit(Resource.Success(data))
        } catch (ioException: IOException) {
            emit(Resource.Error(ioException.localizedMessage ?: "Unknown error"))
        }
    }.flowOn(Dispatchers.IO)

    override fun editNote(note: Note) = flow {
        emit(Resource.Loading())
        try {
            val data = noteDao.editNote(note.toNoteEntity())
            emit(Resource.Success(data))
        } catch (ioException: IOException) {

        }
    }.flowOn(Dispatchers.IO)

        override fun deleteNote(note: Note) = flow() {
            emit(Resource.Loading())
            try {
                val data = noteDao.deleteNote(note.toNoteEntity())
                emit(Resource.Success(data))
            } catch (ioException: IOException) {

            }
        }.flowOn(Dispatchers.IO)

    override fun getAllNotes(): kotlinx.coroutines.flow.Flow<Resource<List<Note>>> = flow{
        emit(Resource.Loading())
        try {
            val data = noteDao.getNotes().map { it.toNote() }
            emit(Resource.Success(data))
        } catch (ioException: IOException) {

        }
    }.flowOn(Dispatchers.IO)

    }
