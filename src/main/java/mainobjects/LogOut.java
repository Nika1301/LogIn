package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
    private WebDriver driver;

    public LogOut(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickLogout() {
        Logout.click();
    }
    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/a")
    private WebElement Logout;
}
