package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By FormAuthentificationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver){this.driver=driver;}
    public  LoginPage clickFormAuthentificationLink(){
        driver.findElement(FormAuthentificationLink).click();
  return new LoginPage(driver);
    }




}
