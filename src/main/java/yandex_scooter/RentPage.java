package yandex_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RentPage {
    private WebDriver driver;
    private By date = By.xpath(".//div[@class='react-datepicker-wrapper']/div/input");
    private By date1 = By.xpath(".//div[@class='react-datepicker__week']/div[@aria-label='Choose суббота, 1-е октября 2022 г.']");
    private By time1 = By.xpath(".//div[@class='Dropdown-menu']/div[3]");
    private By colourBlack = By.id("black");
    private By colourGrey = By.id("grey");
    private By comment1 = By.cssSelector(".Input_InputContainer__3NykH .Input_Responsible__1jDKN");
    private By rent = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[2]");
    private By approve = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[2]/button[2]");
    private By successfully = By.className("Order_ModalHeader__3FDaJ");

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendFirstInfoForRentScooter(String comment) {
        driver.findElement(date1).click();
        driver.findElement(time1).click();
        driver.findElement(comment1).sendKeys(comment);
        driver.findElement(rent).click();
    }

    public void selectColourScooter(String colour) {
        if (colour == "black") {
            driver.findElement(colourBlack).click();
        } else {
            driver.findElement(colourGrey).click();
        }
    }

    public void sendApproveForRentScooter() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.findElement(approve)).click();
    }

    public String sendTextSuccessfullyForRentScooter() {
        return driver.findElement(successfully).getText();
    }

}

