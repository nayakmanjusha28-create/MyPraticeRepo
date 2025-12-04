package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import utils.Reusable;
public class Class4_LoginTest extends BaseTest {

	 @Test
	    public void loginFunctionality() {
	        Reusable reusable = new Reusable(driver);

	        reusable.clickElement(By.xpath("//button[text()='Login']"));
	        reusable.enterText(By.id("username"), prop.getProperty("username"));
	        reusable.enterText(By.id("password"), prop.getProperty("password"));
	        reusable.clickElement(By.xpath("//button[text()='Login to QKart']"));

	        // Wait for Logout link
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        By logoutLocator = By.xpath("//button[text()='Logout']"); // update if actual locator differs
	        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLocator));

	        Assert.assertTrue(reusable.isDisplayed(logoutLocator), "Logout link is not displayed after login");
	    }
	}
