import java.util.Calendar;

/**
 * Created by Rizwan on 7/13/2017.
 */
public class Book extends LibraryItem {


    public Book(String title, String author, Boolean status, Calendar dueDate) {
        super(title, author, status, dueDate);

    }

    @Override
    public String toString() {
        return
                "Title: " + title + '\n' +
                "Author: " + author + '\n'+
                "Status: " + status + '\n' +
                "Due Date: " + dueDate;
    }
}