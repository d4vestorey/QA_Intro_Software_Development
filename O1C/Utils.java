package Labs.O1C;

import java.util.Scanner;

public class Utils {
    
    Scanner scanner = new Scanner(System.in);
    
    public int getInt(String prompt) {
        System.out.println(prompt);
        int enteredInt = Integer.parseInt(scanner.nextLine());
        return enteredInt;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String enteredString = scanner.nextLine();
        return enteredString;
    }
}
