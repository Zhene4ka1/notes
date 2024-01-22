package com.example.notes.util;

import com.example.notes.Model.Note;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class NoteValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Note.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Note note = (Note) target;
    }
}
