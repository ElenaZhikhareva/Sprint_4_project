import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import yandex_scooter.MainPage;

import static org.junit.Assert.assertEquals;

public class MainPageTest {
    WebDriver driver = new ChromeDriver();
    MainPage objMainPage = new MainPage(driver);

    @Before
    public void startUp() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objMainPage.clickCookie();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void checkEqualTextAccordionHeadin_0() {
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = objMainPage.getTextAccordionHeadin0();
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualTextAccordionHeadin_1() {
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = objMainPage.getTextFromAccordionHeadin1();
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualTextAccordionHeadin2() {
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = objMainPage.getTextFromAccordionHeadin2();
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualTextAccordionHeadin3() {
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = objMainPage.getTextFromAccordionHeadin3();
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualTextAccordionHeadin4() {
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = objMainPage.getTextFromAccordionHeadin4();
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualTextAccordionHeadin5() {
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = objMainPage.getTextFromAccordionHeadin5();
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualTextAccordionHeadin6() {
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = objMainPage.getTextFromAccordionHeadin6();
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualTextAccordionHeadin7() {
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = objMainPage.getTextFromAccordionHeadin7();
        assertEquals(expected, actual);
    }
}
