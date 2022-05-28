package ryanbaltichomework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTesting {
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS_COUNT = By.id("adults");
    private final By CHILDREN_COUNT = By.id("children");
    private final By LUGGAGE = By.id("bugs");
    private final By SELECT = By.id("flight");
    private final By GET_PRICE = By.xpath(".//span[@style='cursor: pointer;']");

    @Test
    public void WebPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN");

        WebElement name = browser.findElement(NAME);
        name.sendKeys("Ananasik");
        WebElement surname = browser.findElement(SURNAME);
        surname.sendKeys("Pineapple");
        WebElement discount = browser.findElement(DISCOUNT);
        discount.sendKeys("666");
        WebElement adults = browser.findElement(ADULTS_COUNT);
        adults.sendKeys("0");
        WebElement children = browser.findElement(CHILDREN_COUNT);
        children.sendKeys("10");
        WebElement luggage = browser.findElement(LUGGAGE);
        luggage.sendKeys("1");
        WebElement select = browser.findElement(SELECT);
        Select flights = new Select(browser.findElement(By.id("flight")));
        flights.selectByValue("11");
        WebElement price = browser.findElement(GET_PRICE);
        price.click();






    }
}


