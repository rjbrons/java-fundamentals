package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linter {

    public void lint(String filePath) throws FileNotFoundException {
        try {
            Scanner scan = new Scanner(new File(filePath));
            int lineCount = 0;
            while (scan.hasNextLine()) {
                lineCount++;
                String newLine = scan.nextLine();
                if (newLine.endsWith("{") || newLine.endsWith("}") || newLine.length() < 1 || newLine.contains("if") || newLine.contains("else")){
                    continue;
                } else if (!newLine.endsWith(";")) {
                    System.out.println(String.format("Line %d: Missing semicolon.", lineCount));
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found.");
            System.out.println(e);
        }
    }
}


