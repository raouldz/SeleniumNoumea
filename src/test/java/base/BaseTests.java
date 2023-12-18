package test.java.base;

import main.java.pages.HomePage;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTests {
    private  WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public  void setUp(){
       /*
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        driver.quit();
        */
        System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);


    }
    @AfterClass
    public void tearDown(){driver.quit();}
    /*
     public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
     */
}
