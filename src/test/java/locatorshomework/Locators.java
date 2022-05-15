package locatorshomework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By ACCEPT_COOKIE_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MAIN_LOGO = By.className("main-logo");
    private final By SEARCH_ICON = By.className("main-search-submit");
    private final By INFO_BTN = By.xpath(".//a[@class='site-top__menu-left-link'][@href='/order_search']");
    private final By FAVORITE_BTN = By.xpath(".//div[@class = 'favorite-items']");
    private final By LV_BTN = By.xpath(".//a[@hreflang = 'lv']");
    private final By RU_BTN = By.xpath(".//a[@hreflang = 'ru']");
    private final By FIRST_SUBMENU = By.xpath(".//a[@href='/c/datortehnika-preces-birojam/2pd']");
    private final By SECOND_SUBMENU = By.xpath(".//a[@href='/c/datoru-komponentes-tikla-produkti/2pe']");
    private final By THIRD_SUBMENU = By.xpath(".//a[@href='/c/telefoni-plansetdatori-apple-veikals/2pc']");
    private final By FOURTH_SUBMENU = By.xpath(".//a[@href='/c/tv-audio-video-spelu-konsoles/2pf']");
    private final By BANNER = By.id("welcome-carousel");




    private final By SEARCH_INPUT_FIELD = By.id("q");

    @Test
    public void searchFieldsCheck() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(BANNER);
        searchField.click();

    }
}

