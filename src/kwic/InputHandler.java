package kwic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    List<String> handleInput() throws FileNotFoundException {
        String inputFileName = getFileName();
        List<String> inputLines = readInputFile(inputFileName);
        return inputLines;
    }

    List<String> readInputFile(String inputFileName) {
        List<String> inputLines = new ArrayList<>();
        try {
           Scanner sc = new Scanner(new FileReader(inputFileName));
            String str;
            while(sc.hasNext()){
                str = sc.next();
                if(!str.isEmpty()) {
                    inputLines.add(str);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e);
        }
        return inputLines;
    }

    String getFileName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del archivo de texto:");
        String fileName = sc.nextLine();
        sc.close();
        return fileName;
    }
}
