package ryanbaltichomework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ryanbaltichomework.pages.BaseFunc;
import ryanbaltichomework.pages.HomePage;
import ryanbaltichomework.pages.RegistPage;

public class WebTesting {
    private final String HOME_PAGE_URL = "http://qaguru.lv:8089/tickets/";

    @Test
    public void WebPage() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(HOME_PAGE_URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.Select("RIX","BCN");

        RegistPage registPage = new RegistPage(baseFunc);
        registPage.name("Ananasik");
        registPage.surname("Pineapple");
        registPage.discount("666");
        registPage.adultsCount("0");
        registPage.childrenCount("10");
        registPage.luggage("1");
        registPage.select("11");
        registPage.getPrice();
    }
}


