public class Mobile {
    String companyName;
    float screenSize;

    Mobile(String companyName, float screenSize) {
        this.companyName = companyName;
        this.screenSize = screenSize;
    }

    void display() {
        System.out.println(companyName + " " + screenSize);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 6.1f);
        Mobile m2 = new Mobile("Apple", 6.7f);
        Mobile m3 = new Mobile("OnePlus", 6.5f);

        m1.display();
        m2.display();
        m3.display();
    }
}
