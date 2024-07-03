package libraryManagement;

public class Transaction {
    private Member member;
    private Book book;
    private String transactionType;
    private String date;

    public Transaction(Member member, Book book, String transactionType, String date) {
        this.member = member;
        this.book = book;
        this.transactionType = transactionType;
        this.date = date;
    }

    public void processTransaction() {
        if (transactionType.equals("borrow")) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                member.borrowBook();
                System.out.println("Transaction Successful: Book Borrowed");
            } else {
                System.out.println("Transaction Failed: Book Not Available");
            }
        } else if (transactionType.equals("return")) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                member.returnBook();
                System.out.println("Transaction Successful: Book Returned");
            } else {
                System.out.println("Transaction Failed: Book Not Borrowed");
            }
        }
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "member=" + member.getName() +
                ", book=" + book.getTitle() +
                ", transactionType='" + transactionType + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

