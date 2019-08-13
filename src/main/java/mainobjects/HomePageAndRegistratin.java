package mainobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageAndRegistratin {
String s;

    private WebDriver driver;

    public HomePageAndRegistratin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignup() {
        Signup.click();

    }

    public void sendKeysZipcod() {

        Zipcod.sendKeys("2345678");

    }

    public void clickContinue() {
        Continue.click();

    }

    public void sendKeysName() {
        Name.sendKeys("Nika");


    }

    public void sendKeysEmail() {
        Email.sendKeys("butterfly130188@gmail.com");

    }

    public void sendKeysPassword() {

        Password.sendKeys("13011988");
    }

    public void sendKeysConfermpass() {

        Confermpass.sendKeys("13011988");
    }

    public void clickregistration() {


        registration.click();



    }

    public void clickhere() {


        here.click();

    }

    public void clickshoppingCart() {
        shoppingCart.click();

    }

    public void sendkeysLogEmail() {

        LogEmail.sendKeys("rajiv_baker@787.25.sharelane.com");
    }

    public void sendkeysLogPassword() {
        LogPassword.sendKeys("1111");
    }

    public void clickButtonLogin() {

        ButtonLogin.click();
    }

    public void sendkeysSearch() {
        Search.sendKeys("White Fang");
    }

    public void clickbtnSearch() {
        btnSearch.click();
    }


    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
    private WebElement Search;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
    private WebElement btnSearch;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement LogEmail;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement LogPassword;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement ButtonLogin;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement Signup;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement Zipcod;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement Continue;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement Name;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement Email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement Password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement Confermpass;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement registration;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a")
    private WebElement here;




}


