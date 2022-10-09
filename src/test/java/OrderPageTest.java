import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import yandex_scooter.MainPage;
import yandex_scooter.OrderPage;
import yandex_scooter.RentPage;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;

public class OrderPageTest {
    WebDriver driver = new FirefoxDriver();
    MainPage objMainPage = new MainPage(driver);
    OrderPage objOrderPage = new OrderPage(driver);
    RentPage objRentPage = new RentPage(driver);

    @Before
    public void startUp() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objMainPage.clickCookie();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void checkOrderScooterForSendLoginFirstVersionToClickButtonUp() {
        objOrderPage.clickButtonUp();
        objOrderPage.sendLoginFirstVersion();
        objRentPage.sendFirstInfoForRentScooter();
        objRentPage.sendApproveForRentScooter();
        String expected = "Заказ оформлен";
        String actual = objRentPage.sendTextSuccessfullyForRentScooter();
        MatcherAssert.assertThat(actual, containsString(expected));
    }

    @Test
    public void checkOrderScooterForSendLoginSecondVersionToClickButtonDown() {
        objOrderPage.clickButtonDown();
        objOrderPage.sendLoginSecondVersion();
        objRentPage.sendSecondInfoForRentScooter();
        objRentPage.sendApproveForRentScooter();
        String expected = "Заказ оформлен";
        String actual = objRentPage.sendTextSuccessfullyForRentScooter();
        MatcherAssert.assertThat(actual, containsString(expected));
    }
}
