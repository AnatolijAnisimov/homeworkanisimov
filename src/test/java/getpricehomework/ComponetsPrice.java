package getpricehomework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class ComponetsPrice {
        private final String MENU_ITEM_TO_OPEN = "Datoru komponentes, tīkla produkti";
        private final String CATEGORY_TO_OPEN = "Atmiņa, HDD un SSD";
        private final String SUBCAT_TO_OPEN = "Operatīvā atmiņa";
        private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
        private final By MENU = By.xpath(".//div[@class = 'submenu-lvl1 submenu-lvl1--invisible submenu-lvl1--index']");
        private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]");
        private final By CATEGORY_MENU = By.xpath(".//div[@class = 'filter-block only-desktop']");
        private final By CATEGORY_ITEM = By.xpath(".//a[contains(@href, 'datoru-komponentes-tikla-produkti')]");
        private final By SUBCAT_MENU = By.xpath(".//div[@class = 'block block-category-list']");
        private final By SUBCAT_ITEM = By.xpath(".//li[contains(@class,'new-cat-item')]");


        @Test
        public void WebPage() {
            System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
            WebDriver browser = new ChromeDriver();
            browser.manage().window().maximize();
            browser.get("http://www.1a.lv");
            WebDriverWait wait = new WebDriverWait (browser, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

            browser.findElement(ACCEPT_COOKIES_BTN).click();

            List<WebElement> items = browser.findElement(MENU).findElements(MENU_ITEM);
            for (WebElement web : items) {
                if (web.getText().equals(MENU_ITEM_TO_OPEN)) {
                    web.click();
                    break;
                }
            }

            List<WebElement> catItems = browser.findElement(CATEGORY_MENU).findElements(CATEGORY_ITEM);
            for (WebElement web : catItems) {
                if (web.getText().contains(CATEGORY_TO_OPEN)) {
                    web.click();
                    break;
                }
            }

            List<WebElement> subCatItems = browser.findElement(SUBCAT_MENU).findElements(SUBCAT_ITEM);
            for (WebElement web : subCatItems) {
                if (web.getText().contains(SUBCAT_TO_OPEN)) {
                    web.click();
                    break;
                }
            }


        }
    }

