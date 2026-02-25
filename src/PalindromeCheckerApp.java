import java.util.Stack;

class UseCase5PalindromeCheckerApp {

    static void main() {

        String original = "madam";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
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
