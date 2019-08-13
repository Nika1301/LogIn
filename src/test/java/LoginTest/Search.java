package LoginTest;

import mainobjects.HomePageAndRegistratin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    private WebDriver driver;


    @Before
    public void SetUp() throws Exception {
        driver = new ChromeDriver();

    }

    @Test
    public void Search() throws Exception {
        HomePageAndRegistratin homePage = new HomePageAndRegistratin(driver);

        driver.manage().window().maximize();
        driver.get("http://sharelane.com/cgi-bin/main.py");

        homePage.sendkeysSearch();
        homePage.clickbtnSearch();

        Thread.sleep(10000);

        driver.close();

    }

    @After
    public void tearDown() throws Exception {

        driver.quit();

    }
}



