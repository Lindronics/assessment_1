package com.lindronics.notes;

public class TextNote extends Note {

    public TextNote(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
