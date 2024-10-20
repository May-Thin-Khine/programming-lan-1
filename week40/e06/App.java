package e06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Palindrome test, please enter some text: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome");
            }

            if (input.equalsIgnoreCase("Quit")) {
                break;
            }
        }
        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[\\W]", "").toLowerCase();

        return cleanText.equals(new StringBuilder(cleanText).reverse().toString());
    }
}
