package yandex_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;

    private By cookie = By.id("rcc-confirm-button");

    //вопросы о важном_1
    private By accordionHeading0 = By.id("accordion__heading-0");
    private By accordionPanel0 = By.id("accordion__panel-0");
    //вопросы о важном_2
    private By accordionHeading1 = By.id("accordion__heading-1");
    private By accordionPanel1 = By.id("accordion__panel-1");
    //вопросы о важном_2
    private By accordionHeading2 = By.id("accordion__heading-2");
    private By accordionPanel2 = By.id("accordion__panel-2");
    //вопросы о важном_3
    private By accordionHeading3 = By.id("accordion__heading-3");
    private By accordionPanel3 = By.id("accordion__panel-3");
    //вопросы о важном_4
    private By accordionHeading4 = By.id("accordion__heading-4");
    private By accordionPanel4 = By.id("accordion__panel-4");
    //вопросы о важном_5
    private By accordionHeading5 = By.id("accordion__heading-5");
    private By accordionPanel5 = By.id("accordion__panel-5");
    //вопросы о важном_6
    private By accordionHeading6 = By.id("accordion__heading-6");
    private By accordionPanel6 = By.id("accordion__panel-6");
    //вопросы о важном_7
    private By accordionHeading7 = By.id("accordion__heading-7");
    private By accordionPanel7 = By.id("accordion__panel-7");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookie() {
        driver.findElement(cookie).click();
    }

    public String getTextAccordionHeadin0() {
        WebElement element = driver.findElement(accordionHeading0);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading0).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel0)).getText();
    }

    public String getTextFromAccordionHeadin1() {
        WebElement element = driver.findElement(accordionHeading1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading1).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel1)).getText();
    }

    public String getTextFromAccordionHeadin2() {
        WebElement element = driver.findElement(accordionHeading2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading2).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel2)).getText();
    }

    public String getTextFromAccordionHeadin3() {
        WebElement element = driver.findElement(accordionHeading3);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading3).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel3)).getText();
    }

    public String getTextFromAccordionHeadin4() {
        WebElement element = driver.findElement(accordionHeading4);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading4).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel4)).getText();
    }

    public String getTextFromAccordionHeadin5() {
        WebElement element = driver.findElement(accordionHeading5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading5).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel5)).getText();
    }

    public String getTextFromAccordionHeadin6() {
        WebElement element = driver.findElement(accordionHeading6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading6).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel6)).getText();
    }

    public String getTextFromAccordionHeadin7() {
        WebElement element = driver.findElement(accordionHeading7);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(accordionHeading7).click();
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(accordionPanel7)).getText();
    }

}
