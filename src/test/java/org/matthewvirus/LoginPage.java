package org.matthewvirus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'passp-field-login')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@id, 'passp-field-passwd')]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[contains(@id, 'passp:sign-in')]")
    private WebElement loginButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String login) {
        passwordField.sendKeys(login);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}