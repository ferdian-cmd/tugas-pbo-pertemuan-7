package pertemuan7.ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFound {

    public static void main(String args[]) {
        try {
            File file = new File("E://File.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("file hilang" + e.getMessage());
        }
    }
}
