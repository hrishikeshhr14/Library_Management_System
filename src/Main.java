public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");
        Book book3 = new Book("hrx","shrike","2345");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Register members
        Member member1 = new Member("hrishi", "M001");
        Member member2 = new Member("durai", "M002");
        library.registerMember(member1);
        library.registerMember(member2);

        // Borrow a book
        boolean success = library.borrowBook("M001", "1234567890");
        if (success) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book borrow failed.");
        }

        // Print library details
        System.out.println(library);
    }
}
