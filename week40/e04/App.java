package e04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("You named: " + name);

        for (int i = name.length() - 1; i >= 0; i -=2){
            char result = name.charAt(i);
            System.out.println(result);

        }
        scanner.close();
        
    }

}
