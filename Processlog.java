
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Processlog {
    public static void main(String[] args) {
        try {

            FileInputStream fileInputStream = new FileInputStream("Log.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            for (String line = bufferedReader.readLine(); line != null;line = bufferedReader.readLine()) {
                System.out.println(line);
                
            }
         
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " );
            
        }
 
    }
}