import LIbrary_steem.Book;//public class LIbrary_steem.Main {
import LIbrary_steem.Library;
import LIbrary_steem.Member;

public static void main(String[] args) {
        System.out.println("Welcome to the library Management System");
        Library library = new Library();

        Book book1 = new Book(1,"The Great Gatsby","F. Scott Fitzgerald",true);
        Book book2 = new Book(2,"To Kill a Mockingbird","Harper Lee",true);
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new LIbrary_steem.Member(1,"Alice");
        LIbrary_steem.Member member2 = new LIbrary_steem.Member(2,"Bob");
        library.registerMember(member1);
        library.registerMember(member2);

        library.displayBooks();
        library.displayMembers();

        member2.borrowBook(book1);

        library.displayBooks();
        library.displayMembers();

        member2.returnBook(book1);

        library.displayBooks();
        library.displayMembers();
    }
//}


