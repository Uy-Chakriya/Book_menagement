package LIbrary_steem;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("LIbrary_steem.Book added: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("LIbrary_steem.Member registered: " + member.getName());
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) return book;
        }
        return null;
    }

    public Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) return member;
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Books in LIbrary_steem.Library:");
        for (Book book : books) {
            book.getDetails();
        }
    }
    public void displayMembers() {
        System.out.println("LIbrary_steem.Library Members:");
        for (Member member : members) {
            member.getDetails();
        }
    }
}


