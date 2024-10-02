public class LibTab {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "JK Rowling", true );
        Book book2 = new Book("Percy Jackson - The Lightning Thief", "Rick Riordan", false );

        book1.checkOut();
        book1.displayBookDetails();
        book1.returnBook();
        book1.displayBookDetails();

        book2.checkOut();
        book2.displayBookDetails();
        book2.returnBook();
        book2.displayBookDetails();
    }
}
