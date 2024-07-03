package libraryManagement;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        Transaction transaction1 = new Transaction(member1, book1, "borrow", "2024-07-03");
        Transaction transaction2 = new Transaction(member2, book2, "borrow", "2024-07-03");

        transaction1.processTransaction();
        transaction2.processTransaction();

        System.out.println(transaction1);
        System.out.println(transaction2);

        transaction1 = new Transaction(member1, book1, "return", "2024-07-10");
        transaction1.processTransaction();

        System.out.println(transaction1);
    }
}

