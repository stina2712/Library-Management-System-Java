import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner sc = new Scanner(System.in);
        
        // Adding some initial books
        myLibrary.addBook(new Book("Java Programming", "Scaler"));
        myLibrary.addBook(new Book("Clean Code", "Robert Martin"));

        System.out.println("Welcome to the Library System!");
        myLibrary.showBooks();
    }
}