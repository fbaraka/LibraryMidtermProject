import java.util.Calendar;

/**
 * Created by Rizwan on 7/13/2017.
 */
public class LibraryItem {

    private String title;
    private String author;
    private Boolean status;
    private Calendar dueDate;

    public LibraryItem(String title, String author, Boolean status, Calendar dueDate) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.dueDate = dueDate;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

}
