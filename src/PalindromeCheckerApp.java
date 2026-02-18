/*
 * Use Case 2: Print a Hardcoded Palindrome Result
 * Palindrome Checker App
 * Version: 1.0
 */

class UseCase2PalindromeCheckerApp {

    static void main() {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Variable to store reversed string
        StringBuilder reversed = new StringBuilder();

        // Logic to reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        // Display original word
        System.out.println("Given Word: " + word);

        // Conditional check using if-else
        if (word.contentEquals(reversed)) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
