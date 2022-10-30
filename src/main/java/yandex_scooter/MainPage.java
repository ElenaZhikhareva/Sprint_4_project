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

    public String  getTextAnswer (String question) {
        String answer;
        switch (question) {
            case "Сколько это стоит? И как оплатить?":
                driver.findElement(accordionHeading0).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel0)).getText();
                break;
            case "Хочу сразу несколько самокатов! Так можно?":
                driver.findElement(accordionHeading1).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel1)).getText();
                break;
            case "Как рассчитывается время аренды?":
                driver.findElement(accordionHeading2).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel2)).getText();
                break;
            case "Можно ли заказать самокат прямо на сегодня?":
                driver.findElement(accordionHeading3).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel3)).getText();
                break;
            case "Можно ли продлить заказ или вернуть самокат раньше?":
                driver.findElement(accordionHeading4).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel4)).getText();
                break;
            case "Вы привозите зарядку вместе с самокатом?":
                driver.findElement(accordionHeading5).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel5)).getText();
                break;
            case "Можно ли отменить заказ?":
                driver.findElement(accordionHeading6).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel6)).getText();
                break;
            case "Я жизу за МКАДом, привезёте?":
                driver.findElement(accordionHeading7).click();
                answer = new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(driver -> driver.findElement(accordionPanel7)).getText();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + question);
        }
        return answer;

    }

}
