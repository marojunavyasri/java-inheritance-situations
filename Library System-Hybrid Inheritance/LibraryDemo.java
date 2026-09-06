import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EBook ebook = new EBook();

        System.out.println("Enter E-Book Details");

        System.out.print("Enter title: ");
        ebook.setTitle(sc.nextLine());

        System.out.print("Enter item ID: ");
        ebook.setItemId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter author: ");
        ebook.setAuthor(sc.nextLine());

        System.out.print("Enter file size in MB: ");
        ebook.setFileSize(sc.nextDouble());
        sc.nextLine();

        Magazine magazine = new Magazine();

        System.out.println("\nEnter Magazine Details");

        System.out.print("Enter title: ");
        magazine.setTitle(sc.nextLine());

        System.out.print("Enter item ID: ");
        magazine.setItemId(sc.nextInt());

        System.out.print("Enter issue number: ");
        magazine.setIssueNumber(sc.nextInt());

        System.out.println("\nE-Book Details");
        ebook.displayItemDetails();
        ebook.displayBookDetails();
        ebook.displayEBookDetails();

        System.out.println("\nMagazine Details");
        magazine.displayItemDetails();
        magazine.displayMagazineDetails();

        sc.close();
    }
}
