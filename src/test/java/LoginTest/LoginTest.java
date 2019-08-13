package LoginTest;

import mainobjects.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void SetUp() throws Exception {
        driver = new ChromeDriver();

    }

    @Test
    public void LoginTest() throws Exception {
        HomePageAndRegistratin homePage = new HomePageAndRegistratin(driver);



        driver.manage().window().maximize();
        driver.get("http://sharelane.com/cgi-bin/main.py");


        homePage.sendkeysLogEmail();


        homePage.sendkeysLogPassword();

        homePage.clickButtonLogin();

        Thread.sleep(1000);

        driver.close();

    }

    @After
    public void tearDown() throws Exception {

        driver.quit();

    }
}