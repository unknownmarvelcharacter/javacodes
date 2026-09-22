interface TY {
    int rollno = 41;
    String name = "Nishad";
}

interface SY {
    int result = 85;
}

class Student implements TY, SY {
    void show() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Result: " + result);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
