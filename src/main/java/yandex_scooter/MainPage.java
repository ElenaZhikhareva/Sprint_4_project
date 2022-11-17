package yandex_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;
    private final By cookie = By.id("rcc-confirm-button");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookie() {
        driver.findElement(cookie).click();
    }//клик на куки

    public String getTextAnswer(String textForFind) {
        driver.findElement(new By.ByXPath("//*[text()='" + textForFind + "']")).click();
        return (new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(driver.findElement(new By.ByXPath
                        ("//*[text()='" + textForFind + "']/../../*[@class='accordion__panel']/p")))).getText());
    }
}