package factorialtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import reuseablepack.Basejava;
import reuseablepack.ReusableMethods;

public class CClass2 extends Basejava{
	 @Test
	    public void verifyPageDetails() {
	        WebElement textbox = driver.findElement(By.id("number"));
	        String placeholder = ReusableMethods.getPlaceholder(textbox);
	        Assert.assertEquals(placeholder, "Enter an integer", " Placeholder mismatch");

	        String title = driver.getTitle();
	        Assert.assertTrue(title.contains("Factorial"), " Title mismatch");

	        String url = driver.getCurrentUrl();
	        Assert.assertTrue(url.contains("https"), " URL mismatch");
	    }
	

}
