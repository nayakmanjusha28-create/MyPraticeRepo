package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HomePage {
	 WebDriver driver;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public WebElement loginButton() {
	        return driver.findElement(By.xpath("//button[text()='Login']"));
	    }

	    public WebElement registerButton() {
	        return driver.findElement(By.xpath("//button[text()='Register']"));
	    }

	    public WebElement searchTextBox() {
	        return driver.findElement(By.xpath("//input[@placeholder='Search for items/categories']"));
	    }

	    public int totalImages() {
	        return driver.findElements(By.tagName("img")).size();
	    }

	    public int totalLinks() {
	        return driver.findElements(By.tagName("a")).size();
	    }
	}