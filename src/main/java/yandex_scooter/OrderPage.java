package yandex_scooter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final WebDriver driver;
    private final By nameText = By.xpath(".//input[@placeholder='* Имя']");
    private final By surnameText = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By addressText = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metrostation = By.cssSelector(".select-search__value .select-search__input");
    private final By metrostationChoice = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    private final By userPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By nextPageButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(By button) {
        driver.findElement(button).click();
    }
    public void sendLogin(String name, String surname,
                          String address, String phone) {
        driver.findElement(nameText).sendKeys(name);
        driver.findElement(surnameText).sendKeys(surname);
        driver.findElement(addressText).sendKeys(address);
        driver.findElement(metrostation).click();
        driver.findElement(metrostationChoice).click();
        driver.findElement(userPhone).sendKeys(phone);
        driver.findElement(nextPageButton).click();
    }
}
