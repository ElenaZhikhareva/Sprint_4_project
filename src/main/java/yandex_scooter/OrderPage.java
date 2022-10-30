package yandex_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    private final WebDriver driver;

    private final By button = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");

    private final By name1 = By.xpath(".//input[@placeholder='* Имя']");
    private final By surname1 = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By address1 = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metrostation1 = By.cssSelector(".select-search__value .select-search__input");
    private final By telephone1 = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By next1 = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton() {
        driver.findElement(button).click();
    }


    public void sendLogin(String name,String surname,
                                      String address, String telephone) {
        driver.findElement(name1).sendKeys(name);
        driver.findElement(surname1).sendKeys(surname);
        driver.findElement(address1).sendKeys(address);
        driver.findElement(metrostation1).click();
        driver.findElement(telephone1).sendKeys(telephone);
        driver.findElement(next1).click();
    }



}
