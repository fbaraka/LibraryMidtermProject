import java.util.ArrayList;
import java.io.*;

public class Library {
    ArrayList<LibraryItem> items = new <LibraryItem>ArrayList();

    public Library() {
        getList();
    }

    public ArrayList<LibraryItem> getList() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("books.txt"));
            String readLine = bufferedReader.readLine();

            while (readLine != null) {
                int i = 1;
                String[] fileValues = readLine.split(",");
                String titles = fileValues[0];
                String authors = fileValues[1];
                String availability = fileValues[2];

                LibraryItem bookObject = new LibraryItem(titles, authors, availability);
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
                System.out.println(items.get(i).getTitle() + " by " + items.get(i).getTitle());
            }
        }
    }
    public void searchAuthor(String userInput){
         for(int i = 0; i <items.size(); i++){
             if(items.get(i).getAuthors().equalsIgnoreCase(userInput)){
                 System.out.println(items.get(i).getTitle() + " by " + items.get(i).getTitle());
             }
         }
    }

    public void checkOut(int userInput){
        items.remove(userInput -1);
        for (LibraryItem x : items) {
            System.out.println(x);
        }
    }
    public void numberedList(){
        for (int i = 1; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i).getTitle());
        }
    }
}
