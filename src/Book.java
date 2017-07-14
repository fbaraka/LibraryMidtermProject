


/**
 * Created by Rizwan on 7/13/2017.
 */
public class Book extends LibraryItem {
    public Book(String title, String author, String status) {
        super(title, author, status);
    }

    @Override
    public String toString() {
        return
                "Title: " + getTitle() + '\n' +

                        "Author: " + getAuthor() + '\n'+
                        "Status: " + getStatus() + '\n' ;
    }
}
