package org.matthewvirus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=/'root'/]/div/div[2]/div[3]/main/div/div/div/div[1]/div/div/div/div[7]/div[2]/div[1]/div[2]]")
    private WebElement selectionArrow;

    @FindBy(xpath = "//*[contains(text(), 'Выйти на всех устройствах')]")
    private WebElement logoutButton;

    public void openList() {
        selectionArrow.click();
    }

    public void logout() {
        logoutButton.click();
    }
}