package com.lindronics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.lindronics.notes.Note;
import com.lindronics.notes.TextAndImageNote;
import com.lindronics.notes.TextNote;

public class NoteStore {

    private List<Note> notes = new ArrayList<Note>();

    public void storeNote(String message) {
        notes.add(new TextNote(message));
    }

    public void storeNote(String message, URL imageURL) {
        notes.add(new TextAndImageNote(message, imageURL));
    }

    public List<Note> getAllTextNotes() {
        return notes.stream().filter(n -> (n instanceof TextNote)).collect(Collectors.toList());
    }

    public List<Note> getAllTextAndImageNotes() {
        return notes.stream().filter(n -> (n instanceof TextAndImageNote)).collect(Collectors.toList());
    }

}
