import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Call the method to check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove any spaces and convert the string to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Initialize pointers at the beginning and the end of the string
        int start = 0;
        int end = str.length() - 1;
        
        // Loop through the string while comparing characters from both ends
        while (start < end) {
            // If characters don't match, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        // If we made it through the loop, the string is a palindrome
        return true;
    }
}
