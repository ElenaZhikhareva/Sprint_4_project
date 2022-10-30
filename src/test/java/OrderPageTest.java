import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import yandex_scooter.MainPage;
import yandex_scooter.OrderPage;
import yandex_scooter.RentPage;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;

@RunWith(Parameterized.class)
public class OrderPageTest {

    private String name;
    private String surname;
    private String address;
    private String metrostation;
    private String telephone;
    private String next;
    private String date;
    private String colour;
    private String day;
    private String comment;


    WebDriver driver = new ChromeDriver();
    MainPage objMainPage = new MainPage(driver);
    OrderPage objOrderPage = new OrderPage(driver);
    RentPage objRentPage = new RentPage(driver);

    public OrderPageTest(String name, String surname, String address,
                      String metrostation, String telephone, String next,String date,String day, String colour, String comment)
    {

        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metrostation = metrostation;
        this.telephone = telephone;
        this.next = next;
        this.date = date;
        this.colour = colour;
        this.day = day;
        this.comment = comment;

    }

    @Before
    public void startUp() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objMainPage.clickCookie();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Parameterized.Parameters
    public static Object[][] getDate() {
        return new Object[][]{
                { "Елена", "Жихарева", " Лесная 15", "Маяковская", "+79111111111", "Заказ оформлен" ,"30.10.2022","grey","seven",""},
                { "Владимир", "Васильев","Кирова 113", " Чистые пруды", "+79145678789", "Заказ оформлен", "31.12.2022","black","three", "Нет домофона, предварительно позвонить"},
        };
    }


    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void checkOrderScooterForSendLoginFirstVersionToClickButtonUp() {
        objOrderPage.clickButton();
        objOrderPage.sendLogin(name, surname, address, telephone);
        objRentPage.sendFirstInfoForRentScooter(comment);
        objRentPage.selectColourScooter(colour);
        objRentPage.sendApproveForRentScooter();
        String expected = "Заказ оформлен";
        String actual = objRentPage.sendTextSuccessfullyForRentScooter();
        MatcherAssert.assertThat(actual, containsString(expected));
    }

}
