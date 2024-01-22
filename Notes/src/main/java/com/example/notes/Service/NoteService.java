package com.example.notes.Service;

import com.example.notes.Model.Note;
import com.example.notes.Repository.NoteRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepo noteRepo;

    public Note save(Note note){
        return  noteRepo.save(note);
    }

    public Optional<Note> getById(Long id){
        return noteRepo.findById(id);
    }

    public void delete(Long id){
        noteRepo.deleteById(id);
    }
    public List<Note> getAllNotes(){
        return noteRepo.findAll();
    }
}

