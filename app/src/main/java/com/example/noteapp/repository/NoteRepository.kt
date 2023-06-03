package com.example.noteapp.repository

import com.example.noteapp.data.NoteDao
import com.example.noteapp.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val dao: NoteDao
) {
    suspend fun addNote(note: Note) = dao.insertNote(note)
    suspend fun updateNote(note: Note) = dao.updateNote(note)
    suspend fun deleteNote(note: Note) = dao.deleteNote(note)
    suspend fun deleteAllNotes() = dao.deleteAllNotes()
    fun getAllNotes() = dao.getNotes()
}