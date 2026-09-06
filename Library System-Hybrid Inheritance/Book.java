public class Book extends LibraryItem {
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Author: " + author);
    }
}
