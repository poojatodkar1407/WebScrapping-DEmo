import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Google {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.google.com/search?q=bridgelabz&oq=bridgelabz+&aqs=chrome..69i57j69i59j69i60j69i61j69i60j69i65l3.6671j0j4&sourceid=chrome&ie=UTF-8").get();
//        System.out.println(doc);_67l1
//        String title = doc.body().text();
//        System.out.println(title);

        String divs = doc.getElementsByClass("Aq14fc").text();
        System.out.println("Google Overall Ratings : " + divs);
    }
}
