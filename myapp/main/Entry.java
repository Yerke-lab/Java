package myapp.main;

import myapp.main.logic.Note;

public class Entry {
    public static void main(String[] args) {
        Note note = new Note();
        note.setNoteText("Hello, world!");
        note.saveToFile();
    }
}
