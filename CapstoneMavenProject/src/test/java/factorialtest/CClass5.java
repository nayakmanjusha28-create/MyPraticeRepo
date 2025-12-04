package factorialtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import reuseablepack.Basejava;

public class CClass5 extends Basejava {

	@Test
	public void verifyFactorialNotDisplayedForFourDigitInput() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement inputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("number")));
	    inputBox.clear();
	    inputBox.sendKeys("1000");

	    WebElement calcBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("getFactorial")));
	    calcBtn.click();

	    WebElement resultDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultDiv")));
	    String actualText = resultDiv.getText().trim();

	    System.out.println("Result Text: " + actualText);

	    // If result is empty → print message
	    if (actualText.isEmpty()) {
	        System.out.println(" Actual result is NOT displaying. Application is taking too long to show factorial.");
	    }

	    // Assertion
	    Assert.assertTrue(actualText.isEmpty(), 
	        " Bug NOT detected: Application unexpectedly displayed factorial for 4-digit input. Found: " + actualText);
	}


}
