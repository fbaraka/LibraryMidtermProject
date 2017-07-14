import java.util.Scanner;
/**
 * Created by Feras on 7/12/2017.
 */
public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scan = new Scanner(System.in);
        String yOrN = "";
        System.out.println("Welcome to The Error's Library!");
        System.out.println("Please select an option number from the menu");
        do {
            System.out.println("Menu: \n1 -- Display library list\n2 -- Search the library\n3 -- Checkout item from library\n4 -- Return item to library\n5 -- End session");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Here is everything in our Library!\n"); //fill this in later with the list that has all items inside of it.
                    library.numberedList();
                    break;
                case 2:
                    library.numberedList();
                    scan.nextLine();
                    System.out.println("what would you like to search by?(title or author)");
                    String userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("title")) {
                        System.out.print("Search: ");
                        userInput = scan.nextLine();
                        library.searchTitle(userInput);
                    }
                    break;
                case 3:
                    library.numberedList();
                    System.out.println("Enter the number of the book you would like to check out:");
                    int checkOut = scan.nextInt();
                    library.checkOut(checkOut);
                    break;
                case 4:
                    library.numberedList();
                    System.out.println("Select number to return book: ");
                    int userReturn = scan.nextInt();
                    library.returnBook(userReturn);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }
            scan.nextLine();
            System.out.println("Continue? Y/N");
            yOrN = scan.nextLine();
        }while(yOrN.equalsIgnoreCase("y"));
    }
}