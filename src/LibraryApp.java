
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
        System.out.println("Please enter an option number from the menu");
        do {
            int input = Validator.getInt(scan,"Menu: \n1 -- Display library list\n2 " +
                    "-- Search the library\n3 -- Checkout item from library\n4 -- " +
                    "Return item to library\n5 -- End session", 1, 5);
            switch (input) {
                case 1:
                    System.out.println("Here is everything in our Library!\n");
                    //lists what the books.txt file numbered from 1-12
                    library.numberedList();
                    break;
                case 2:
                    //prompts user to search by author or title. User can search by keywords
                    titleAndAuthorCase2(library, scan);
                    String userInput;
                    //asks user if they would like to check out a book, return, or go to main menu
                    menuPromptCase2(library, scan);
                    break;
                case 3:
                    //lists the books numbered
                    library.numberedList();
                    //allows the user to check out a book, and saves it
                    checkOutMenu(library, scan);
                    break;

                case 4:
                    //allows the user to return a book, and saves it
                    returnBookMenu(library, scan);
                    break;
                case 5:
                    //ends program if the user does not want to continue
                    System.out.println("Goodbye!");
                    break;
            }
            System.out.println("\nGo to main menu? Y/N");
            yOrN = scan.nextLine();
            yOrN = yOrNValid(yOrN);
        }while(yOrN.equalsIgnoreCase("y"));
        library.updatedList(library.items);
    }

    private static void menuPromptCase2(Library library, Scanner scan) {
        String userInput;
        System.out.println("Would you like to go to checkout a book, return a book, or main menu (Enter: C, R, or M)");
        userInput = scan.nextLine();
        if(userInput.equalsIgnoreCase("C")) {
            library.numberedList();
            checkOutMenu(library, scan);
        }
        else if (userInput.equalsIgnoreCase("R")) {
            returnBookMenu(library, scan);
        }
        else {
            return;
        }
    }

    private static void titleAndAuthorCase2(Library library, Scanner scan) {
        //calls the numbered list method to list each book by number
        library.numberedList();
        System.out.println("\n" + "Would you like to search by Title or Author?");
        String userInput = scan.nextLine();
        userInput = titleOrAuthorValid(userInput);
        //if user searches by title, the program will iterate through each book to find the keyword the user enters
        if (userInput.equalsIgnoreCase("title")) {
            System.out.print("Search: ");
            userInput = scan.nextLine();
            library.searchTitle(userInput);
        }
        //if user searches by author, the program will iterate through each book to find the keyword the user enters
        else if (userInput.equalsIgnoreCase("author")){
            System.out.print("Search: ");
            userInput = scan.nextLine();
            library.searchAuthor(userInput);
        }
    }

    private static void returnBookMenu(Library library, Scanner scan) {
        library.numberedList();
        // prompts the user to enter book they would like to return, validates their input
        int userReturn = Validator.getInt(scan,"\n Enter the number of the book " +
                "you would like to return:", 1,12);
        library.returnBook(userReturn);
    }

    private static void checkOutMenu(Library library, Scanner scan) {
        // prompts the user to enter book they would like to checkout, validates their input
        int checkOut = Validator.getInt(scan,"\n Enter the number of the book " +
                "you would like to check out:", 1,12);

        library.checkOut(checkOut);
    }

    public static String yOrNValid(String yOrN) {
        Scanner keyboard = new Scanner(System.in);
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
}
    public static String titleOrAuthorValid(String userInput) {
        Scanner keyboard = new Scanner(System.in);
        while (!userInput.equalsIgnoreCase("title") && !userInput.equalsIgnoreCase("author")) {
            System.out.println("Invalid Input. Please enter Title or Author: ");
            userInput = keyboard.nextLine();
        }
        return userInput;
    }
 }