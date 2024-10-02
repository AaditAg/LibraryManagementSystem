public class Book {

    public String title;
    public String author;
    public boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void checkOut() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayBookDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Author: " + author);

        String availability = "Not available\n";

        if (isAvailable) {
            availability = "Available\n";
        }

        System.out.println("Available: " + availability);
    }
}