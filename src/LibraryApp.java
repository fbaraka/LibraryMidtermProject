import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Feras on 7/12/2017.
 */
/*Display primary list
        this is will be our first
        arrayList

        Prompt user to select options:
        1. display list
        2. search list
        - generates new arrayList
        based off search keyword
        3. checkout book from list
        -write to our books.txt
        -changes status
        -adds due date
        4. return book to list
        -writes to our books.txt
        -changes status

        5. end or extend session
        --our loop*/

public class LibraryApp {
    public static void main(String[] args) {
Library library = new Library();


        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to The Error's Library!");

        System.out.println("Please select an option number from the menu");
        System.out.println("Menu: \n1 -- Display library list\n2 -- Search the library\n3 -- Checkout item from library\n4 -- Return item to library\n5 -- End session");

        int input = scan.nextInt();

        switch (input) {
            case 1:
                System.out.println("REPLACE THIS WITH OUR ITEM ARRAY"); //fill this in later with the list that has all items inside of it.


                break;
            case 2:
                System.out.println("what would you like to search by?(title or author");
                String userinput = scan.nextLine();
                String userChoice;


                System.out.println("Here's a list of all the items that match your search!");
                //call the method that creates a new ArrayList based off the keyword
                //then print it out on the console for them to see
                System.out.println("REPLACE THIS WITH THE ARRAYLIST...");
                break;
            case 3:
            //call the method that creates a new ArrayList of the checked out items in the library
            System.out.println("Here's a list of all the checked out items and when they are due back!");
            System.out.println("REPLACE THIS WITH THE ARRAYLIST...");
            break;

            //This is my hypothetical fori loop to print a list of the "check out" array with a number in front.
//            for (int i = 0; i < array.length; i++) {
//                System.out.println((i + 1) + array[i]);
//            }

            //craft a way for the user to select an option and collect their input with scan
            //use that input to recognize that item in the arrayList
            //call a method to set that item's status to unavailable
            //call a method to set that item's return date



            case 4:
            System.out.println("Here's a list of all of the items that have been checked-out!");
            System.out.println("REPLACE THIS WITH THE ARRAYLIST...");

            //This is my hypothetical fori loop to print a list of the "check out" array with a number in front.
//            for (int i = 0; i < array.length; i++) {
//                System.out.println((i + 1) + array[i]);
//            }

            //craft a way for the user to select an option and collect their input with scan
            //use that input to recognize that item in the arrayList
            //call a method to set that item's status to available
            //call a method to set that item's return date to empty or none

            System.out.println("Please select which item you would like to return");
//            input = scan.nextInt(array[i]);

            System.out.println("You selected 'TITLE OF OBJECT'");
            break;

            case 5:
                System.out.println("Goodbye!");
                break;

        }


    }

}
