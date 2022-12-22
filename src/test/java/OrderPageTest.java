import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import yandex_scooter.MainPage;
import yandex_scooter.OrderPage;
import yandex_scooter.RentPage;
import java.time.Duration;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderPageTest {
    final String color;
    final By button;
    final String name;
    final String surname;
    final String address;
    final String telephone;
    final String comment;
    WebDriver driver = new ChromeDriver();
    MainPage objMainPage = new MainPage(driver);
    OrderPage objOrderPage = new OrderPage(driver);
    RentPage objRentPage = new RentPage(driver);

    public OrderPageTest(By button, String name, String surname, String address,
                         String telephone, String color, String comment) {
        this.button = button;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.color = color;
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
                {By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g"), "Елена", "Жихарева", " Лесная 15", "+79111111111", "серая безысходность", " "},
                {By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g"), "Владимир", "Васильев", "Кирова 113", "+79145678789", "чёрный жемчуг", "Нет домофона, предварительно позвонить"},
        };
    }

    @Test
    public void checkOrderScooterForSendLoginFirstVersionToClickButtonUp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        objOrderPage.clickButton(button);
        objOrderPage.sendLogin(name, surname, address, telephone);
        objRentPage.selectColourScooter(color);
        objRentPage.calendarDate();
        objRentPage.rentalDuration();
        objRentPage.userComment(comment);
        objRentPage.orderButton();
        objRentPage.confirmButton();
        assertTrue("есть какая-то ошибка", objRentPage.isOrderCreated());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}