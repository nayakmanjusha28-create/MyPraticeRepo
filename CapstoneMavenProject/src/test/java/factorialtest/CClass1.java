package factorialtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import reuseablepack.Basejava;
import reuseablepack.ReusableMethods;

public class CClass1 extends Basejava {
	 @Test
	    public void validateUIElements() {
	        WebElement textbox = driver.findElement(By.id("number"));
	        WebElement calcBtn = driver.findElement(By.id("getFactorial"));
	        WebElement about = driver.findElement(By.xpath("//a[text()='About']"));
	        WebElement terms = driver.findElement(By.xpath("//a[text()='Terms and Conditions']"));
	        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));

	        Assert.assertTrue(ReusableMethods.isElementClickable(textbox), "Textbox not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(calcBtn), "Calculate button not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(about), "about button not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(terms), "terms button not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(privacy), "privacy button not clickable");
	    }
}
