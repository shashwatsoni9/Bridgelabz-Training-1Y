
class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "City Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }
}

class TextBook extends Book {
    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {
    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new TextBook(1, "Java Programming", 500);
        Book b2 = new Magazine(2, "Tech Monthly", 100);

        System.out.println("Fine: " + b1.calculateFine(3));
        System.out.println("Fine: " + b2.calculateFine(3));
    }
}
