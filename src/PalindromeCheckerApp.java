class UseCase3PalindromeCheckerApp {

    static void main() {

        String original = "level";
        StringBuilder reversed = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }

        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        if (original.contentEquals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
