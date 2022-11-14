package yandex_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;

    private final By cookie = By.id("rcc-confirm-button");

    //вопросы о важном_1
    private final By accordionHeading0 = By.id("accordion__heading-0");
    private final By accordionPanel0 = By.id("accordion__panel-0");
    //вопросы о важном_2
    private final By accordionHeading1 = By.id("accordion__heading-1");
    private final By accordionPanel1 = By.id("accordion__panel-1");
    //вопросы о важном_2
    private final By accordionHeading2 = By.id("accordion__heading-2");
    private final By accordionPanel2 = By.id("accordion__panel-2");
    //вопросы о важном_3
    private final By accordionHeading3 = By.id("accordion__heading-3");
    private final By accordionPanel3 = By.id("accordion__panel-3");
    //вопросы о важном_4
    private final By accordionHeading4 = By.id("accordion__heading-4");
    private final By accordionPanel4 = By.id("accordion__panel-4");
    //вопросы о важном_5
    private final By accordionHeading5 = By.id("accordion__heading-5");
    private final By accordionPanel5 = By.id("accordion__panel-5");
    //вопросы о важном_6
    private final By accordionHeading6 = By.id("accordion__heading-6");
    private final By accordionPanel6 = By.id("accordion__panel-6");
    //вопросы о важном_7
    private final By accordionHeading7 = By.id("accordion__heading-7");
    private final By accordionPanel7 = By.id("accordion__panel-7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookie() {
        driver.findElement(cookie).click();
    }

    public String getTextAnswer (String question, String expected){
        driver.findElement(accordionHeading0).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel0)).getText();

        driver.findElement(accordionHeading1).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel1)).getText();

        driver.findElement(accordionHeading2).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel2)).getText();

        driver.findElement(accordionHeading3).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel3)).getText();

        driver.findElement(accordionHeading4).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel4)).getText();

        driver.findElement(accordionHeading5).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel5)).getText();

        driver.findElement(accordionHeading6).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel6)).getText();

        driver.findElement(accordionHeading7).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel7)).getText();

        return question;
    }

}

