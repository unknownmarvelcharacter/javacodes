public class try_catch_finally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}