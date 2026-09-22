import java.util.Scanner;

public class ReverseAndSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int reversedNum = 0;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            sum += digit;
            temp /= 10;
        }

        if (num < 0) {
            reversedNum = -reversedNum;
        }

        System.out.println("Reversed Number: " + reversedNum);
        System.out.println("Sum of Digits: " + sum);
        sc.close();
    }
}