package com.example.noteapp.data

import com.example.noteapp.model.Note

class NoteDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Movie Day", description = "Watching a Movie With Family"),
            Note(title = "Movie Day", description = "Watching a Movie With Family"),
            Note(title = "Movie Day", description = "Watching a Movie With Family"),
            Note(title = "Movie Day", description = "Watching a Movie With Family"),
            Note(title = "Movie Day", description = "Watching a Movie With Family"),
            Note(title = "Movie Day", description = "Watching a Movie With Family")
        )
    }
}