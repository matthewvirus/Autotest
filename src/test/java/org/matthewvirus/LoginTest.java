package org.matthewvirus;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver(); // driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void loginTest() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.clickLoginButton();
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickLoginButton();
        /*String user = profilePage.getUserName();
        Assert.assertEquals(ConfProperties.getProperty("login"), user);*/
    }

    @AfterClass
    public static void tearDown() {
        /*profilePage.openList();
        profilePage.logout();*/
        driver.quit();
    }
}