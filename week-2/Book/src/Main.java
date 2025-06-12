import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BookCollection myCollection = new BookCollection();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book\n2. Remove Book\n3. List Books\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    Book book = new Book(isbn, title, author);
                    myCollection.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    myCollection.removeBook(removeIsbn);
                    break;

                case 3:
                    myCollection.displayBooksList();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}

