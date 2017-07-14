
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

            //System.out.println("Menu: \n1 -- Display library list\n2 -- Search the library\n3 -- Checkout item from library\n4 -- Return item to library\n5 -- End session");
            int input = Validator.getInt(scan,"Menu: \n1 -- Display library list\n2 " +
                    "-- Search the library\n3 -- Checkout item from library\n4 -- " +
                    "Return item to library\n5 -- End session", 1, 5);


            switch (input) {
                case 1:
                    System.out.println("Here is everything in our Library!\n"); //fill this in later with the list that has all items inside of it.
                    library.numberedList();
                    break;
                case 2:
                    library.numberedList();
                    //scan.nextLine();
                    System.out.println("\n" + "Search by: Title or Author");
                    String userInput = scan.nextLine();
                    userInput = titleOrAuthorValid(userInput);

                    if (userInput.equalsIgnoreCase("title")) {
                        System.out.print("Search: ");
                        userInput = scan.nextLine();
                        library.searchTitle(userInput);
                    }

                    else if (userInput.equalsIgnoreCase("author")){
                        System.out.print("Search: ");
                        userInput = scan.nextLine();
                        library.searchAuthor(userInput);
                    }
                    break;
                case 3:
                    library.numberedList();
                    int checkOut = Validator.getInt(scan,"\n Enter the number of the book " +
                            "you would like to check out:", 1,12);

                    library.checkOut(checkOut);
                    break;

                case 4:
                    library.numberedList();
                    int userReturn = Validator.getInt(scan,"\n Enter the number of the book " +
                            "you would like to return:", 1,12);
                    library.returnBook(userReturn);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }

            //scan.nextLine();
            System.out.println("\nContinue? Y/N");
            yOrN = scan.nextLine();
            yOrN = yOrNValid(yOrN);
        }while(yOrN.equalsIgnoreCase("y"));
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