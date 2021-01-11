import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Instagram {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.instagram.com/confident_coder/").get();
   //     System.out.println(doc);
//        String title = doc.body().text();
//        System.out.println(title);

        Elements divs = doc.getElementsByTag("meta");
        //System.out.println(divs);

        for (Element metaTag : divs) {
            String content = metaTag.attr("content");
            System.out.println("contents is"+content);
            String name = metaTag.attr("name");

//            if("d.title".equals(name)) {
//                System.out.println("Content is"+content);
//            }
//            if("d.description".equals(name)) {
////                System.out.println(content);
//            }
//            if("d.language".equals(name)) {
////                System.out.println(content);
//            }
        }
    }
}
