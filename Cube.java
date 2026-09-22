public class Cube {
    private int length;
    private int breadth;
    private int height;

    Cube() {
        this(1, 1, 1);
    }

    Cube(int side) {
        this(side, side, side);
    }

    Cube(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void volume() {
        System.out.println("Volume = " + (length * breadth * height));
    }

    public static void main(String[] args) {
        Cube c1 = new Cube();
        Cube c2 = new Cube(5);
        Cube c3 = new Cube(4, 5, 6);

        c1.volume();
        c2.volume();
        c3.volume();
    }
}