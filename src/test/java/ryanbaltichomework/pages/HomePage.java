package ryanbaltichomework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private final By DROP_FROM = By.id("afrom");
    private final By DROP_TO = By.id("bfrom");
    private final By GO_GO_GO = By.className("gogogo");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
 public void Select(String from,String to) {
        baseFunc.select(DROP_FROM,from);
        baseFunc.select(DROP_TO,to);
        baseFunc.click(GO_GO_GO);
    }



}
