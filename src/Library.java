import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.List;

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
}
