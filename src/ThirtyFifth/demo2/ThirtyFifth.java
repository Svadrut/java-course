package ThirtyFifth.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThirtyFifth {
    public static void main(String[] args) {
        File file = new File("src/ThirtyFifth/test.txt");

        try {
            FileReader fr = new FileReader(file);

            // This will not be executed if an exeption is thrown
            System.out.println("Continuing...");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }

        System.out.println("Finished.");
    }
}
