package LIbrary_steem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final int id;
    private final String name;
    private final List<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Methods
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
        } else {
            System.out.println("LIbrary_steem.Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println("This book is not borrowed by " + name);
        }
    }

    public void getDetails() {
        System.out.println("LIbrary_steem.Member ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Borrowed Books: " + borrowedBooks);
        for (Book book : borrowedBooks) {
            System.out.println(" - " + book.getTitle());
        }
    }
}


