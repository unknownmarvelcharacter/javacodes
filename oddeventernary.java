import java.util.Scanner;

public class oddeventernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(result);
        sc.close();
    }
}