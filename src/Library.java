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
        System.out.println("Book added: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.getName());
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
        System.out.println("Books in Library:");
        for (Book book : books) {
            book.getDetails();
        }
    }
    public void displayMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            member.getDetails();
        }
    }
}


