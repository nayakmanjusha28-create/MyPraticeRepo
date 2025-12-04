package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reusable {
	 WebDriver driver;

	    public Reusable(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickElement(By locator) {
	        driver.findElement(locator).click();
	    }

	    public void enterText(By locator, String text) {
	        driver.findElement(locator).clear();
	        driver.findElement(locator).sendKeys(text);
	    }

	    public String getText(By locator) {
	        return driver.findElement(locator).getText();
	    }

	    public boolean isDisplayed(By locator) {
	        return driver.findElement(locator).isDisplayed();
	    }

	    public String getAttribute(By locator, String attribute) {
	        return driver.findElement(locator).getAttribute(attribute);
	    }

	    public int countElements(By locator) {
	        return driver.findElements(locator).size();
	    }
	}