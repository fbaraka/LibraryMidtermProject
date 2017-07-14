import java.time.LocalDate;

/**
 * Created by Rizwan on 7/13/2017.
 */
public class Book extends LibraryItem {
    public Book(String title, String author, String status, String date) {
        super(title, author, status, date);
    }
    @Override
    public String toString() {
        return
                getTitle() + ',' + getAuthor() + ','+ getStatus() + "," + getDueDate() + "\n";
    }
}
