package kwic;

import java.io.FileNotFoundException;
import java.util.List;

public class KWIC {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        try {
            List<String> inputLines = inputHandler.handleInput();
            PermGenerator permGenerator = new PermGenerator(inputLines);
            System.out.println("KWIC");
            permGenerator.getPerms().forEach((p) -> {
                System.out.println(p);
            });
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
    }
}
