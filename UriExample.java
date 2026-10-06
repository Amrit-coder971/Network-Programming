import java.net.URI;

public class UriExample {
    public static void main(String[] args) {
        try{
       URI urlstr = new URI("https://example.com/site/shop/products/item.html?categories=electronics&id=9876null//#region%20abcd");
       System.out.println("host: "+urlstr.getHost());
       System.out.println("path: "+urlstr.getPath());
       System.out.println("port: "+urlstr.getPort());
       System.out.println("query: "+urlstr.getQuery());
       System.out.println("user info: "+urlstr.getUserInfo());
       System.out.println("scheme: "+urlstr.getScheme());
       System.out.println("scheme specific part: "+urlstr.getSchemeSpecificPart());
       System.out.println("fragment: "+urlstr.getFragment());
       System.out.println("raw fragment: "+urlstr.getRawFragment());

        }
        catch(Exception e){
            e.getMessage();
        } 
    }
}