import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Glassdoor {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.glassdoor.co.in/Reviews/BridgeLabz-Solutions-Reviews-E1318507.htm").get();
        //  System.out.println(doc);
//       String  title = doc.body().text();
//        System.out.println(title);
//        Elements formElement = doc.select("a.reviewLink");
//        for (Element div : formElement) {
//            System.out.println("element is");
//            System.out.println(div.ownText());
//        }
        // System.out.println(formElement);
        String divs = doc.getElementsByClass("v2__EIReviewsRatingsStylesV2__ratingNum v2__EIReviewsRatingsStylesV2__large").text();
        System.out.println("Glassdoor Overall Ratings : " + divs);


        System.out.println("completed");
    }

}