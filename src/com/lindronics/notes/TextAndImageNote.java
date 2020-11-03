package com.lindronics.notes;

import java.net.URL;

public class TextAndImageNote extends Note {

    private URL imageURL;

    public TextAndImageNote(String text, URL imageURL) {
        super(text);
        this.imageURL = imageURL;
    }
    
}
