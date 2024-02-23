package com.example.notesapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Query
import com.example.notesapp.model.Note
import com.example.notesapp.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel (app : Application,private val NoteRepository: NoteRepository):AndroidViewModel(app){

    fun addNote(note: Note) =
        viewModelScope.launch {
            NoteRepository.insertNote(note)
        }
    fun deleteNote(note: Note) =
        viewModelScope.launch {
            NoteRepository.deleteNote(note)
        }
    fun updateNote(note: Note) =
        viewModelScope.launch {
            NoteRepository.updateNote(note)
        }
    fun getAllNotes() = NoteRepository.getAllNotes()

    fun searchNote(query: String?) =
        NoteRepository.searchNote(query)

        }
