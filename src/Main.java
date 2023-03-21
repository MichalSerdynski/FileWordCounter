import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String filePath = "/Users/michal/Desktop/FileWordCounter/src/";

            Scanner keyboard = new Scanner(System.in);

            System.out.println("File name: ");
            String name = keyboard.next();

            filePath += name;

            Scanner scan = new Scanner(new File(filePath));

            ArrayList<String> words = new ArrayList<>();

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineWords = line.split(" ");
                for (String word : lineWords) {
                    words.add(word);
                }
            }

            System.out.println("All words in the file:");
            for (String word : words) {
                System.out.println(word);
            }

            System.out.println("\nTotal words: " + words.size());

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
