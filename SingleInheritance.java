class BookSingle {
    String author = "Chetan Bhagat";
    String title = "2 States";
    String publisher = "Rupa";
}

class BookInfoSingle extends BookSingle {
    int price = 300;
    int stock = 10;

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        BookInfoSingle b = new BookInfoSingle();
        b.show();
    }
}