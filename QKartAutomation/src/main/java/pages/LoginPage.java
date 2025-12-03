package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement usernameTextbox() {
        return driver.findElement(By.id("username"));
    }

    public WebElement passwordTextbox() {
        return driver.findElement(By.id("password"));
    }

    public WebElement loginSubmitButton() {
        return driver.findElement(By.xpath("//button[text()='Login to QKart']"));
    }

    public WebElement logoutLink() {
        return driver.findElement( By.xpath("//button[text()='Logout']"));
    }
}