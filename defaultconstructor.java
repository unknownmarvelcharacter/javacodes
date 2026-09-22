class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "hi";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}
