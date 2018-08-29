package kwic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KWIC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();
        String str;
        do {
            System.out.print("Ingresa la siguiente frase: ");
            str = sc.nextLine();
            if (!str.isEmpty()) {
                inputLines.add(str);
            }
        } while (!str.isEmpty());
        PermGenerator permGenerator = new PermGenerator(inputLines);
        System.out.println("KWIC");
        permGenerator.getPerms().forEach((p) -> {
            System.out.println(p);
        });
    }

}
