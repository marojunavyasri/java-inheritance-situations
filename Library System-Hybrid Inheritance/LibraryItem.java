public class LibraryItem {
    private String title;
    private int itemId;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
    }
}
