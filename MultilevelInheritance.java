class BookMulti {
    String author = "Chetan Bhagat";
    String title = "2 States";
    String publisher = "Rupa";
}

class BookInfoMulti extends BookMulti {
    int price = 300;
    int stock = 10;
}

class BookSalesMulti extends BookInfoMulti {
    int copies = 5;

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Copies Sold: " + copies);
        System.out.println("Revenue: " + (price * copies));
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BookSalesMulti b = new BookSalesMulti();
        b.show();
    }
}