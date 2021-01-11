import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Facebook {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.facebook.com/pg/bridgelabz/reviews/")
                .header("Accept-Language", "en-US,en;q=0.5")
                .get();;
//        System.out.println(doc);_67l1
//        String title = doc.body().text();
//        System.out.println(title);

        String divs = doc.getElementsByClass("_67l1").text();
        System.out.println("Facebook Overall Ratings : " + divs);
    }
}
