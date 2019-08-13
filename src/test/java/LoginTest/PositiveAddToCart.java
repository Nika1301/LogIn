package LoginTest;

import mainobjects.HomePageAndRegistratin;
import mainobjects.ShoppingCart;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveAddToCart {
    private WebDriver driver;

    @Before
    public void SetUp() throws Exception {
        driver = new ChromeDriver();

    }

    @Test
    public void AdToCart() throws Exception {
        HomePageAndRegistratin homePage = new HomePageAndRegistratin(driver);
        ShoppingCart buyBook = new ShoppingCart(driver);
        driver.manage().window().maximize();
        driver.get("http://sharelane.com/cgi-bin/main.py");

        Thread.sleep(1000);
        homePage.sendkeysSearch();
        homePage.clickbtnSearch();
        buyBook.clickaddTocart();
        homePage.clickshoppingCart();

        Thread.sleep(1000);
        Assert.assertTrue("You Add book", driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span")).getText().contains("Oops, error. You must log in"));
        System.out.println("Oops, error. You must log in");
        driver.close();

    }

    @After
    public void tearDown() throws Exception {

        driver.quit();
    }

}
