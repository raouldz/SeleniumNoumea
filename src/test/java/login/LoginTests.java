package test.java.login;

import main.java.pages.LoginPage;
import main.java.pages.SecureAreaPage;
import org.testng.annotations.Test;
import test.java.base.BaseTests;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentificationLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage SecureAreaLogin = loginPage.clickOnloginButton();
        assertTrue(SecureAreaLogin.getAlertText().contains("You logged into a secure area! "),"Alert is incorrect");
    }
}
