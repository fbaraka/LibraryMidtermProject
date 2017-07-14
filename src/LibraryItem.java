import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Rizwan on 7/13/2017.
 */
public class LibraryItem {

    private String title;
    private String author;
    private String status;
    private LocalDate dueDate;

    public LibraryItem(String title, String author, String status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public LibraryItem() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        dueDate = LocalDate.now().plusDays(14);
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {

        this.dueDate = LocalDate.now().plusDays(14);
    }

}