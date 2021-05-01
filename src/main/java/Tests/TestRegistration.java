package Tests;

import Pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRegistration {

    RegistrationPage registration;
    @BeforeTest
    public void start() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com/index.php?rt=account/create");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * This test case will register a new user
     * <p>
     * Fill in valid data
     * <p>
     * Submit
     * <p>
     * Verify the successful registration URL
     */
    @Test
    public void Test() {
        registration = new RegistrationPage(driver);
        registration.Register("fName", "lName", "mail12@fgh.fvh", "SDFG ghm 34g", "Portsmuth", 5, "34567", "Ana12345",
                "Ana12345%", "Ana12345%");
        String URL = registration.checkURL();
        Assert.assertEquals(URL, "https://automationteststore.com/index.php?rt=account/success");
    }

    @AfterTest
    public void Finish() {
        driver.quit();
    }
}