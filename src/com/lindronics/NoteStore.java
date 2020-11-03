package com.lindronics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.lindronics.notes.Note;
import com.lindronics.notes.TextAndImageNote;
import com.lindronics.notes.TextNote;

public class NoteStore {

    private List<Note> notes = new ArrayList<Note>();

    /**
     * Stores a new {@link com.lindronics.notes.TextNote}.
     * 
     * @param message Note text
     */
    public void storeNote(String message) {
        notes.add(new TextNote(message));
    }

    /**
     * Stores a new {@link com.lindronics.notes.TextAndImageNote}. Will only work if
     * URL is well-formed.
     * 
     * @param message  Note text
     * @param imageURL URL string to the image
     */
    public void storeNote(String message, String imageURL) {
        try {
            notes.add(new TextAndImageNote(message, new URL(imageURL)));
        } catch (MalformedURLException e) {
            System.err.println("Note could not be added due to malformed URL!");
        }
    }

    /**
     * @return every {@link com.lindronics.notes.TextNote} stored in the list.
     */
    public List<Note> getAllTextNotes() {
        return notes.stream().filter(n -> (n instanceof TextNote)).collect(Collectors.toList());
    }

    /**
     * @return every {@link com.lindronics.notes.TextAndImageNote} stored in the
     *         list.
     */
    public List<Note> getAllTextAndImageNotes() {
        return notes.stream().filter(n -> (n instanceof TextAndImageNote)).collect(Collectors.toList());
    }

}
