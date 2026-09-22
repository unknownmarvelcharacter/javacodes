import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        int lower = Math.min(start, end);
        int upper = Math.max(start, end);
        int sum = 0;

        for (int i = lower; i <= upper; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers between " + lower + " and " + upper + " is: " + sum);
        sc.close();
    }
}