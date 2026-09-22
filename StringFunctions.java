import java.util.Scanner;

public class StringFunctions {
    static void checkPassword(String password) {
        String correctPassword = "java123";

        if (password.equals(correctPassword)) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Password is incorrect.");
        }
    }

    static void checkPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    static void displayReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse of string: " + reverse);
    }

    static void countVowels(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }

    static void countCharacters(String str) {
        System.out.println("Number of characters: " + str.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();
        checkPassword(password);

        System.out.print("\nEnter a string: ");
        String str = sc.nextLine();

        checkPalindrome(str);
        displayReverse(str);
        countVowels(str);
        countCharacters(str);

        sc.close();
    }
}

