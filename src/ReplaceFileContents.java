import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

/**
 * Created by chand on 7/14/2017.
 */
public class ReplaceFileContents {

    String userInput;

    public void replace() {

        String originalFilename = "book.txt";
        String tempFileName = "tmp_book.txt";

        BufferedReader buff1 = null;
        BufferedReader buff2 = null;

        try {
            buff1 = new BufferedReader(new FileReader(originalFilename));
            buff2 = new BufferedReader(new FileReader(tempFileName));

            String line;

            while (line = buff1.readLine() != null){
                if (line.contains(userInput)){

                }
            }
        }catch (){

        }
    }
 
}
