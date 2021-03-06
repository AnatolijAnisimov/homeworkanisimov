package ryanbaltichomework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunc {
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {

        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void click(By locator) {
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(locator));
        try {
            we.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Can't click from the first try");
            we.click();
        }
    }

    public void type(By locators, String text) {
        WebElement we = findElement(locators);
        we.clear();
        we.sendKeys(text);
    }

    public void pressKey(By locators, Keys key) {
        findElement(locators).sendKeys(key);
    }
   public void select(By locators,String value){
    Select flights = new Select(driver.findElement(locators));
        flights.selectByValue(value);
    }
    public WebElement findElement(By locators) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locators));
    }

}