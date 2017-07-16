import java.time.LocalDate;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Library {
    public static Scanner scan = new Scanner(System.in);

    ArrayList<LibraryItem> items = new <LibraryItem>ArrayList();
    public Library() {
        getList();
    }
    //reads file called books.txt, puts what's separated by commas into variables, which is then put into a book object
    public ArrayList<LibraryItem> getList() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("books.txt"));
            String readLine = bufferedReader.readLine();
            while (readLine != null) {
                int i = 1;
                String[] fileValues = readLine.split(",");

                LibraryItem bookObject = new Book(fileValues[0], fileValues[1], fileValues[2], fileValues[3]);

                items.add(bookObject);
                readLine = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        return items;
    }
    public void searchTitle(String userInput) {
        StringBuffer stringBuff = new StringBuffer();
        for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getTitle().toLowerCase().contains(userInput.toLowerCase())) {
                    stringBuff.append(items.get(i).getTitle() + " by " + items.get(i).getAuthor() + "\n");
                }
            }
            //if the user enters wrong title/keyword, will prompt the user to go back to main menu and try again
            if (stringBuff.length() == 0) {
                System.out.print("Not found. Going back to main menu. ");
                userInput = scan.nextLine();
            } else {
                System.out.println(stringBuff.toString());
            }
    }
    public void searchAuthor(String userInput) {
        StringBuffer stringBuff = new StringBuffer();
        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getAuthor().toLowerCase().contains(userInput.toLowerCase())) {
                stringBuff.append(items.get(i).getTitle() + " by " + items.get(i).getAuthor() + "\n");
            }
        }
        //if the user enters wrong title/keyword, will prompt the user to go back to main menu and try again
            if (stringBuff.length() == 0) {
                System.out.print("Not found. Going back to menu ");
                userInput = scan.nextLine();
            } else {
                System.out.println(stringBuff.toString());
            }
    }
    public void checkOut(int userInput) {
        //if user chooses to checkout a book, it will set due date 14 days ahead of current date.
        System.out.println(items.get(userInput - 1).getTitle() + " is now checked out.");
        items.get(userInput - 1).setDueDate(LocalDate.now().plusDays(14));
        items.get(userInput - 1).setStatus("unavailable");
    }

    public void returnBook(int userInput) {
        //if user chooses to return a book, the status is set to available
        System.out.println(items.get(userInput - 1).getTitle() + " is now returned.");
        items.get(userInput - 1).setDueDate(null);
        items.get(userInput - 1).setStatus("available");
    }

    public void numberedList() {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getStatus().equalsIgnoreCase("unavailable")) {
                System.out.println(i + 1 + ". " + items.get(i).getTitle() + " "
                        + items.get(i).getAuthor() + " " + items.get(i).getStatus() +
                        " Due Date: " + items.get(i).getDueDate());
            } else {
                System.out.println((i + 1) + ". " + items.get(i).getTitle() + " " + items.get(i).getAuthor() + " "
                        + items.get(i).getStatus());
            }
        }
    }
    public void updatedList(ArrayList<LibraryItem> list){
        try {
            File newList = new File("books.txt");
            FileWriter writer = new FileWriter(newList);
            BufferedWriter buffer = new BufferedWriter(writer);

            for (LibraryItem x : items) {
                buffer.write(String.valueOf(x));
            }
            buffer.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}