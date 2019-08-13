package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

    private WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickaddTocart() {
        addTocart.click();

    }


    public void clickCheckOut() {
        CheckOut.click();
    }

    public void sendKeysNumberCart() {
        NumberCart.sendKeys("1111111111113001");
    }
    public void clickPayment() {
        Payment.click();
    }



    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table[2]/tbody/tr/td[2]/p[2]/a/img")
    private WebElement addTocart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement ShoppingCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[5]/td/form/input[1]")
    private WebElement CheckOut;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/table/tbody/tr[4]/td[2]/input")
    private WebElement NumberCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/table/tbody/tr[7]/td[2]/input")
    private WebElement Payment;

}