package e03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("You entered: " + name);

        for (int i = name.length(); i >= 0; i--) {
            char result = name.charAt(i);
            System.out.println(result);
        }
        scanner.close();
    }

}
