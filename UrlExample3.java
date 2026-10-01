import java.net.URL;
import java.net.URLConnection;
//lab10 : get the header fields 
public  class UrlExample3 {
    public static void main(String[] args) {
 try {
            URL url = new URL("https://example.com");
            URLConnection connection = url.openConnection();


            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("Date: " + connection.getDate());
            System.err.println("Expiration: " + connection.getExpiration());
            System.out.println("Last Modified: " + connection.getLastModified());
             System.out.println("header_field: " + connection.getHeaderField("Content-Type"));// int and string
             System.err.println("header_fields: " + connection.getHeaderFields());  


        } catch (Exception e) {

            e.printStackTrace();
        }
       

        
    }
}