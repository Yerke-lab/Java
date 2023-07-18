package myapp.main.logic;

import java.time.LocalDate;

public class Note {
    private String noteText;

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public void saveToFile() {
        String currentDate = LocalDate.now().toString();
        String noteWithTimestamp = currentDate + " -> " + noteText;

        MyFileWriter.writeToFile(noteWithTimestamp);
    }
}
