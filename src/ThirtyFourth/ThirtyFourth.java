package ThirtyFourth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThirtyFourth {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "/Users/svadrut/Documents/MyApps/java-course/src/ThirtyFourth/example.txt";
         
        File textFile = new File(fileName);
         
        Scanner in = new Scanner(textFile);
         
        int value = in.nextInt();
        System.out.println("Read value: " + value);
         
        in.nextLine();
         
        int count = 2;
        while(in.hasNextLine()) {
            String line = in.nextLine();
             
            System.out.println(count + ": " + line);
            count++;
        }
         
        in.close();
    }
}

