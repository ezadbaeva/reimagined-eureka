package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //     1. private static  instance variable of WebDriver
    private static WebDriver driver;

    //     2. you need to create private  constructor
    private Driver() {
    }


    public static WebDriver getDriver(String driverName) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }
}

    //    3. public method to access the instance variable.
//    we need to put one condition that will check our driver
//    is instantiated or not. if it is already instantiated we
//    will not instantiate one more time.



