package com.trunghd.manage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {

    @Test
    public void contextLoads() {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://truyentranh.net/one-piece/Chap-925").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert doc != null;
        Elements content = doc.select("div.OtherText");
        Elements media = content.select("[src]");
        for (Element src : media) {
            if (src.tagName().equals("img")) {
                System.out.println(src.attr("abs:src"));
            } else {
                System.out.println("K co link");
            }
        }
    }

}
