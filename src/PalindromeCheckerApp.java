import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }
}