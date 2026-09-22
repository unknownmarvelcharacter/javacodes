class Parent {
    int number = 100;

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    int number = 200;

    Child() {
        super();
        System.out.println("Child Constructor");
    }

    void display() {
        System.out.println("Child number = " + number);
        System.out.println("Parent number = " + super.number);
    }
}

public class superkeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}