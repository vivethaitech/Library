package libraryManagement;

public class Member extends Person {
    private int borrowedBooks;

    public Member(String name, String id) {
        super(name, id);
        this.borrowedBooks = 0;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook() {
        borrowedBooks++;
    }

    public void returnBook() {
        borrowedBooks--;
    }

    @Override
    public void displayInfo() {
        System.out.println("Member Name: " + getName());
        System.out.println("Member ID: " + getId());
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}

