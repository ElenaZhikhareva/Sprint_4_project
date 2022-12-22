package yandex_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RentPage {
    private final WebDriver driver;
    private final By calendarDate = By.xpath(".//div[@class='react-datepicker-wrapper']/div/input");//поле для выбора даты
    private final By rentTime = By.xpath("//div[@class='Dropdown-control']");//выбор периода аренды
    private final By rentalDurationChoice = By.xpath("//div[@class='Dropdown-menu']/div[2]"); //поле выбра периода аренды, выбор элемента списка
    private final By userComment = By.cssSelector(".Input_InputContainer__3NykH .Input_Responsible__1jDKN");
    private final By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]"); //кнопка "Заказать"
    private final By confirmButton = By.xpath("//div[@class='Order_Modal__YZ-d3']/div[2]/button[2]"); //кнопка "Да"
    private final By orderCreated = By.xpath("//*[contains(text(), 'Заказ оформлен')]"); //Заказ оформлен
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // форматируем дату для поля
    String date = LocalDate.now().plusDays(3).format(formatter); // получаем текущую дату и прибавляем к ней 3 дня

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void calendarDate() {
        driver.findElement(calendarDate).click();
        driver.findElement(calendarDate).sendKeys(date);
        driver.findElement(calendarDate).sendKeys(Keys.ENTER);
    }

    public void rentalDuration() {
        driver.findElement(rentTime).click();
        driver.findElement(rentalDurationChoice).click();
    }

    public void selectColourScooter(String color) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.findElement(By.xpath((".//*[text()='" + color + "']")))).click();
    }

    public void userComment(String comment) {
        driver.findElement(userComment).sendKeys(comment);
    }

    public void orderButton() {
        driver.findElement(orderButton).click();
    }

    public void confirmButton() {
        driver.findElement(confirmButton).click();
    }

    public boolean isOrderCreated() {
        try {
            return driver.findElement(orderCreated).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}

