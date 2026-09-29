
import java.net.URL;

// lab8:program to extract Url components using URL class methods
public class UrlExample {
    public static void main(String[] args) {

        try {
            URL url = new URL( "https://admin:password@example.com/shop/produts/item.html?category=electromice&id=9876");


        
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Default Port: " + url.getDefaultPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("File: " + url.getFile());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Reference: " + url.getRef());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("User Info: " + url.getUserInfo());
        System.out.println("External Form: " + url.toExternalForm());
        System.out.println("URI: " + url.toURI());



            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


    


