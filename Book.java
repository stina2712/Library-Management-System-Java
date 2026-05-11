public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getters
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }

    // Methods to change state
    public void borrow() { isBorrowed = true; }
    public void returnBook() { isBorrowed = false; }

    @Override
    public String toString() {
        return "Book: " + title + " | Author: " + author + " | Status: " + (isBorrowed ? "Borrowed" : "Available");
    }
}