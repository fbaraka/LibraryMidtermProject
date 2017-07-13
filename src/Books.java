import java.time.LocalDate;

/**
 * Created by chand on 7/12/2017.
 */
public class Books extends Library {
    private String title;
    private String author;

    public Books(){
        this.title = title;
        this.author = author;
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

    @Override
    public LocalDate returnDate() {
        return super.returnDate();
    }

}
