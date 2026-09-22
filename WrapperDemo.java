public class WrapperDemo {
    public static void main(String[] args) {
        int num = 100;
        Integer obj = Integer.valueOf(num);

        System.out.println("Primitive value: " + num);
        System.out.println("Object value: " + obj);

        int value = obj.intValue();
        System.out.println("After unboxing: " + value);
    }
}
