import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        char[] characters = normalized.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = palindromeChecker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }
}