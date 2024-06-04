import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Register a new member
    public void registerMember(Member member) {
        members.add(member);
    }

    // Borrow a book
    public boolean borrowBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null) {
            member.borrowBook(book);
            books.remove(book);
            return true;
        }
        return false;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", members=" + members +
                '}';
    }
}
