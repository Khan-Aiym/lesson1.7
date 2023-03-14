package com.geektech.lesson17.di

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import com.geektech.lesson17.data.local.NoteDao
import com.geektech.lesson17.data.repository.NoteRepositoryImpl
import com.geektech.lesson17.domain.repository.NoteRepository
import com.geektech.lesson17.domain.usecases.EditNoteUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(
        @ApplicationContext context : Context
    ) = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "note_db"
    ).allowMainThreadQueries().build()

    @Singleton
    @Provides
    fun providersNoteData(noteDatabase: Database) = noteDatabase.noteDao()

@Singleton
@Provides
fun providerNoteRepository (
    noteDao: NoteDao
): NoteRepositoryImpl = NoteRepositoryImpl(noteDao)

}