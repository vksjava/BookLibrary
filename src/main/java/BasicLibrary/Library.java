package BasicLibrary;
import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    public void borrowBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }
}
