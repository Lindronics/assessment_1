package com.lindronics.notes;

/**
 * Technically unnecessary, as {@link com.lindronics.notes.TextAndImageNote}
 * could just subclass {@link com.lindronics.notes.TextNote}, but I will leave
 * it in for code clarity.
 */
public abstract class Note {
    protected String text;
}
