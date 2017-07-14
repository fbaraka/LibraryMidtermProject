import java.util.ArrayList;
import java.io.*;

public class Library {
    ArrayList<LibraryItem> items = new <LibraryItem>ArrayList();
    public Library() {
        getList();
    }

    public ArrayList<LibraryItem> getItems() {
        return items;
    }
    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }

    public ArrayList<LibraryItem> getList() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("books.txt"));
            String readLine = bufferedReader.readLine();
            while (readLine != null) {
                int i = 1;
                String[] fileValues = readLine.split(",");
                String title = fileValues[0];
                String author = fileValues[1];
                String status = fileValues[2];
                LibraryItem bookObject = new LibraryItem(title,author,status);

                items.add(bookObject);
                readLine = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return items;
    }

    public void searchTitle(String userInput){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getTitle().equalsIgnoreCase(userInput)){
                System.out.println(items.get(i).getTitle() + " by " + items.get(i).getAuthor());
            }
        }
    }
    public void searchAuthor(String userInput){
        for(int i = 0; i <items.size(); i++){
            if(items.get(i).getAuthor().equalsIgnoreCase(userInput)){
                System.out.println(items.get(i).getTitle() + " by " + items.get(i).getTitle());
            }
        }
    }
    public void checkOut(int userInput){

        System.out.println(items.get(userInput - 1).getTitle() + " is now checked out.");
        System.out.println("Due Date: " + items.get(userInput - 1).getDueDate());
        items.get(userInput - 1).setStatus("unavailable");
        items.get(userInput - 1).getDueDate();
    }

    public void returnBook(int userInput){
        System.out.println(items.get(userInput - 1).getTitle() + " is now returned.");
        items.get(userInput - 1).setDueDate(null);
        items.get(userInput -1).setStatus("available");
    }
    public void numberedList(){
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getStatus().equalsIgnoreCase("unavailable")) {
                System.out.println(i + 1 + ". " + items.get(i).getTitle() + " "
                        + items.get(i).getAuthor() + " " + items.get(i).getStatus() +
                        " Due Date: " + items.get(i).getDueDate());
            }
            else {

                System.out.println((i + 1) + ". " + items.get(i).getTitle() + " " + items.get(i).getAuthor() + " "
                        + items.get(i).getStatus());
            }
        }
    }
}