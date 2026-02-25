import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses multiple palindrome strategy implementations
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * Author: Developer
 * Version: 13.0
 * ============================================================
 */

public class UseCase13PalindromeCheckerApp {

    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = isPalindromeTwoPointer(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = isPalindromeReverse(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("\nInput : " + input);

        System.out.println("\nTwo Pointer Method:");
        System.out.println("Is Palindrome? : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        System.out.println("\nReverse String Method:");
        System.out.println("Is Palindrome? : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");

        System.out.println("\nRecursive Method:");
        System.out.println("Is Palindrome? : " + result3);
        System.out.println("Execution Time : " + (end3 - start3) + " ns");

        sc.close();
    }
}
