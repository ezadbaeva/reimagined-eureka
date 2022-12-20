package tests.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.com.LoginPage;

import java.sql.Driver;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginPage;

@Parameters ("browser")
    @BeforeMethod
    void setUp(){
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       LoginPage loginPage1=new LoginPage(driver);
       driver.get("https://icehrm-open.gamonoid.com/login.php?");
       driver.manage().window().maximize();
    }
@Parameters({"username","password"})
    @Test
    void happyPathLoginTest(String username, String password){
        loginPage.logIn(username, password);

}
}
