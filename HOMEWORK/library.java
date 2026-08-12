import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    String title;
    int itemId;
    boolean isAvailable;

    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    abstract int getLoanPeriod();

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Available: " + isAvailable);
        System.out.println("Loan Period: " + getLoanPeriod() + " days");
    }
}

interface Borrowable {
    void borrowItem();
    void returnItem();
}

class Book extends LibraryItem implements Borrowable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 14;
    }

    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}

class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 0;
    }
}

class DVD extends LibraryItem implements Borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 7;
    }

    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}

class Librarian {

    List<LibraryItem> items = new ArrayList<>();

    void addItem(LibraryItem item) {
        items.add(item);
    }

    void displayAllItems() {
        System.out.println("\nLibrary Items");

        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println();
        }
    }
}

public class library {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", 101);
        Magazine magazine = new Magazine("Tech Today", 102);
        DVD dvd = new DVD("Java Tutorial DVD", 103);

        Librarian librarian = new Librarian();

        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);

        librarian.displayAllItems();

        System.out.println("Borrowing Book");
        book.borrowItem();

        System.out.println("\nBorrowing DVD");
        dvd.borrowItem();

        System.out.println("\nAttempting to Borrow Magazine");
        System.out.println("Magazine cannot be borrowed. It is reference-only.");

        System.out.println("\nReturning Book");
        book.returnItem();

        System.out.println("\nReturning DVD");
        dvd.returnItem();
    }
}