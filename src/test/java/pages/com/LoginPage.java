package pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (id ="username")
    private WebElement username;

    @FindBy (id ="password")
    private WebElement password;

   @FindBy (xpath = "//button[@class='btn btn-info btn-medium w-100 rounded-5 text-uppercase'][@onclick='submitLogin();return false;']")
   private WebElement logInBtn;

    public void logIn (String username, String password){
        this.username.sendKeys("admin");
        this.password.sendKeys("admin");
        this.logInBtn.click();
    }

}
