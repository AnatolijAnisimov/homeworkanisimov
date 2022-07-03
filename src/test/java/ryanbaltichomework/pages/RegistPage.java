package ryanbaltichomework.pages;

import org.openqa.selenium.By;

public class RegistPage {
    private BaseFunc baseFunc;
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS_COUNT = By.id("adults");
    private final By CHILDREN_COUNT = By.id("children");
    private final By LUGGAGE = By.id("bugs");
    private final By SELECT = By.id("flight");
    private final By GET_PRICE = By.xpath(".//span[@style='cursor: pointer;']");

    public RegistPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void name(String name){
        baseFunc.type(NAME,name);
    }
    public void surname(String surname){
        baseFunc.type(SURNAME, surname);
    }
    public void discount(String count){
        baseFunc.type(DISCOUNT,count);
    }
    public void adultsCount(String adults){
        baseFunc.type(ADULTS_COUNT, adults);
    }
    public void childrenCount(String children){
        baseFunc.type(CHILDREN_COUNT, children);
    }
    public void luggage(String bugs){
        baseFunc.type(LUGGAGE, bugs);
    }
    public void select(String value){
        baseFunc.select(SELECT, value);
    }
    public void getPrice(){
        baseFunc.click(GET_PRICE);
    }
}


