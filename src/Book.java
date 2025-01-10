//import java.util.List;
class Book {
    private final int id;
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(int id, String title, String author,boolean isAvailable) {         // Constructor
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    public void getDetails() {
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
        System.out.println("Member ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Authour: " + author);
        System.out.println("Available Books: " + isAvailable);
    }
}

