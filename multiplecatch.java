public class multiplecatch {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}