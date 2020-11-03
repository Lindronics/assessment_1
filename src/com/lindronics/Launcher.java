package com.lindronics;

public class Launcher {

    public static void main(String... args) {
        
        var noteStore = new NoteStore();
        noteStore.storeNote("Lorem impsum dolor.");
        noteStore.storeNote("This is a random test note.");
        noteStore.storeNote("The shopping list on my fridge", "https://www.hsbc.com/");
        noteStore.storeNote("The size label of Jack's shirt", "https://www.hsbc.com/");

        displayTextAndImageNotes(noteStore);
    }

    /**
     * Enumerates and displays all text notes, followed by all text and image notes.
     * @param noteStore Note store containing all notes.
     */
    public static void displayTextAndImageNotes(NoteStore noteStore) {
        for (int i = 0; i < noteStore.getAllTextNotes().size(); i++) {
            System.out.println("Text note " + (i + 1) + ": " + noteStore.getAllTextNotes().get(i));
        }
        for (int i = 0; i < noteStore.getAllTextAndImageNotes().size(); i++) {
            System.out.println("Text and image note " + (i + 1) + ": " + noteStore.getAllTextAndImageNotes().get(i));
        }
    }
}
