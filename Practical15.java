import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.lang.String;
class Practical15{
    public static void main(String a[]) throws IOException,ClassNotFoundException{
        // Pr Question
        URL u = new URL("https://www.javatpoint.com/javafx-tutorial");
        URLConnection url = u.openConnection();
        System.out.print(u.getPort());
        System.out.println(u.getHost());
        System.out.println(u.getPath());
        System.out.println(u.getFile());
        System.out.println(u.getProtocol());
        System.out.println(u.getAuthority());
        System.out.println(u.getContent());
        System.out.println(u.toExternalForm());
        System.out.println("");

        // Ex1 
        URL u2 = new URL("http://www.msbte.org.in");
        URLConnection url2 = u2.openConnection();
        System.out.print(u2.getPort());
        System.out.println(u2.getHost());
        System.out.println(u2.getPath());
        System.out.println(u2.getFile());

        // Ex2 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        URL mainUrl = new URL(str);
        URLConnection conn = mainUrl.openConnection();
        System.out.println(conn.getContentType());
        System.out.println(conn.getExpiration());
        System.out.println(conn.getDate());
        int len = conn.getContentLength();
        String data = (String) conn.getContent();
        int c;
        InputStream i = conn.getInputStream();
        if(!(len>0)){
            System.out.println("No Data Is Present ...");
        }else{
            while((c=i.read()) != -1){
                System.out.println((char)c);
            }
        }
    }
}

/*  Or


import java.net.URL;
import java.net.URLConnection;
import java.lang.*;
import java.net.*;
import java.io.IOException;
import java.io.InputStream;

class Main {
    public static void main(String[] args) throws MalformedURLException, IOException {
        // Pr set
        URL u = new URL("https://www.javatpoint.com/javafx-tutorial:4034");

        System.out.println(u.toString());
        System.out.println(u.getProtocol());
        System.out.println(u.getPort());
        System.out.println(u.getHost());
        System.out.println(u.getFile());
        System.out.println(u.toExternalForm());

        // Ex1
        URL u2 = new URL("https://www.msbte.org.in/");
        System.out.println(u2.getProtocol());
        System.out.println(u2.getPort());
        System.out.println(u2.getHost());
        System.out.println(u2.getFile());
        System.out.println(u2.getFile());

        URLConnection uc = u2.openConnection();
        System.out.println(uc.getContentType());
        System.out.println(uc.getContentLength());
        System.out.println(uc.getExpiration());

        // int s2 = uc.getContentLength();
        // Ex2
        int s2 = 20000;
        int i2, c;
        if (s2 == -1) {
            System.out.println("No Content-Length");
        } else {
            if (s2 != 0) {
                InputStream i = uc.getInputStream();
                i2 = s2;
                while ((c = i.read()) != -1 && i2 != 0) {
                    System.out.print((char) c);
                    i2--;
                    s2--;
                }
            }
        }

    }
}

*/