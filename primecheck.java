import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = num > 1;
        for (int i = 2; i <= num / 2 && isPrime; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}