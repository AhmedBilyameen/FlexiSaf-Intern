import java.util.ArrayList;

public class BookCollection {
    ArrayList<Book> books = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Remove a book by ISBN
    public void removeBook(String isbn) {
        boolean removed = false;
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // List all books
    public void displayBooksList() {
        if (books.isEmpty()) {
            System.out.println("No books in collection.");
        } else {
            System.out.println("\nBook Collection:");
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}