import java.net.URI;
import java.net.URISyntaxException;

//lab  uriutivity methods

public class UriUtivityExample {

    public static void main(String[] args) {

        try {
            URI uri1 = new URI("https://admin:password@example.com/shop/produts/item.html?category=electromice&id=9876");
            URI uri2 = new URI("https://admin:password@example.com/shop/produts/item.html?category=electromice&id=9876");
            URI uri3 = new URI("https://google.com");

            System.out.println(" equals(): " + uri1.equals(uri2));

            System.out.println(" hashCode(): " + uri1.hashCode());

            System.out.println(" compareTo(): " + uri1.compareTo(uri3));

            System.out.println(" toString(): " + uri1.toString());

            System.out.println(" toASCIIString(): " + uri1.toASCIIString());

        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }
    }
}