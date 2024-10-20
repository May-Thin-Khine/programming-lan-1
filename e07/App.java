package e07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a password: ");
            String password = scanner.nextLine();

            if(password.length() < 8) {
                System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter.");
                continue;
            }

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
                if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (hasUppercase && hasLowercase && hasDigit) {
                System.out.println("Password is valid.");
                break;
            }
            else {
                System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter.");
            }

        }
        scanner.close();
    }

}