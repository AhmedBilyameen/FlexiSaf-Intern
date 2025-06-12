<<<<<<< HEAD
public class Book {
    private String isbn;
    private String title;
    private String author;
    public Book(String isbnIn, String titleIn, String authorIn)
    {
        isbn = isbnIn;
        title = titleIn;
        author = authorIn;
    }
    public String getISBN()
    {
        return isbn;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }

    // Display book information
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}
=======
public class Book {
    private String isbn;
    private String title;
    private String author;
    public Book(String isbnIn, String titleIn, String authorIn)
    {
        isbn = isbnIn;
        title = titleIn;
        author = authorIn;
    }
    public String getISBN()
    {
        return isbn;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }

    // Display book information
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}
>>>>>>> 9a2d34e2a936b76336a16973ed97c9c0fcc5efbe
