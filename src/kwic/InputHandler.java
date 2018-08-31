package kwic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    List<String> handleInput() {
        List<String> inputLines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.print("Ingresa la siguiente frase: ");
            str = sc.nextLine();
            if (!str.isEmpty()) {
                inputLines.add(str);
            }
        } while (!str.isEmpty());
        return inputLines;
    }
}
