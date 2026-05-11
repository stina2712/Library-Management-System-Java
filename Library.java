import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void showBooks() {
        System.out.println("\n--- Library Inventory ---");
        for (Book b : inventory) {
            System.out.println(b);
        }
    }
}