package yandex_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    private WebDriver driver;

    private By buttonUp = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
    private By buttonDown = By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g");

    private By name = By.xpath(".//input[@placeholder='* Имя']");
    private By surname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By address = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metrostation = By.cssSelector(".select-search__value .select-search__input");
    private By metrostation1 = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    private By telephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By next = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonUp() {
        driver.findElement(buttonUp).click();
    }

    public void clickButtonDown() {
        driver.findElement(buttonDown).click();
    }

    public void sendLoginFirstVersion() {
        driver.findElement(name).sendKeys("Елена");
        driver.findElement(surname).sendKeys("Жихарева");
        driver.findElement(address).sendKeys("Лесная 15");
        driver.findElement(metrostation).click();
        driver.findElement(metrostation1).click();
        driver.findElement(telephone).sendKeys("+79111111111");
        driver.findElement(next).click();
    }

    public void sendLoginSecondVersion() {
        driver.findElement(name).sendKeys("Владимир");
        driver.findElement(surname).sendKeys("Васильев");
        driver.findElement(address).sendKeys("Кирова 113");
        driver.findElement(metrostation).click();
        driver.findElement(metrostation1).click();
        driver.findElement(telephone).sendKeys("+79145678789");
        driver.findElement(next).click();
    }

}
