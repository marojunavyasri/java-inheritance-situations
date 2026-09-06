public class EBook extends Book {
    private double fileSize;

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("File Size: " + fileSize + " MB");
    }
}
