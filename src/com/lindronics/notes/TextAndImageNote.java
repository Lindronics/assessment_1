package com.lindronics.notes;

import java.net.URL;

public class TextAndImageNote extends Note {

    private URL imageURL;

    public TextAndImageNote(String text, URL imageURL) {
        this.text = text;
        this.imageURL = imageURL;
    }
    
    @Override
    public String toString() {
        return text + ", " + imageURL;
    }
}
