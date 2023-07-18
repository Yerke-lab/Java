package myapp.main.logic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class MyFileWriter {
    public static void writeToFile(String text) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\HOME\\Documents\\ИТ РАЗРАБОТКА ОБУЧЕНИЕ\\Java Core\\homework1\\myapp\\resources\\notes.txt", true)))) {
            writer.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
