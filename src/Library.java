
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chand on 7/12/2017.
 */
public abstract class Library {

    private String status;
    private LocalDate date;

    public Library() {

    }

    public LocalDate returnDate() {
        date = LocalDate.now();
        System.out.println(date);
        //LocalDate.now().plusDays(14); This will add 14 days
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

