package LoginTest;
import mainobjects.HomePageAndRegistratin;
import mainobjects.LogOut;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
    private WebDriver driver;

    @Before
    public void SetUp() throws Exception {
        driver = new ChromeDriver();

    }

    @Test
    public void LogOutTest() throws Exception {
        HomePageAndRegistratin homePage = new HomePageAndRegistratin(driver);

        LogOut logOut = new LogOut(driver);

        driver.manage().window().maximize();
        driver.get("http://sharelane.com/cgi-bin/main.py");


       homePage.sendkeysLogEmail();
        Thread.sleep(500);

        homePage.sendkeysLogPassword();
        Thread.sleep(500);

        homePage.clickButtonLogin();
        Thread.sleep(500);

        logOut.clickLogout();

        Thread.sleep(1000);

        driver.close();

    }

    @After
    public void tearDown() throws Exception {

        driver.quit();

    }

}