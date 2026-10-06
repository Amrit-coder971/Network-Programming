
import java.net.URI;

public class ResolvingRelativeURIsExample {
    public static void main(String[] args) {
        try{
            URI baseUri = new URI("https://example.com");
            URI relativeUri = new URI("images/abc.jpg");
            URI resolvedUri = baseUri.resolve(relativeUri);
            System.out.println(resolvedUri);
        }
        catch(Exception e){
            e.getMessage(); 
        } 
    }
}