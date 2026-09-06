public class Magazine extends LibraryItem {
    private int issueNumber;

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void displayMagazineDetails() {
        System.out.println("Issue Number: " + issueNumber);
    }
}
