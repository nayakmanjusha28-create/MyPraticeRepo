package factorialtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import reuseablepack.Basejava;

public class CClass4 extends Basejava {
	   @Test
	    public void verifyAboutLinks() {
	        driver.findElement(By.linkText("About")).click();

	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	        int totalLinks = allLinks.size();

	        Assert.assertTrue(totalLinks > 5, " Less than 5 links found on About page");

	        System.out.println("Total Links: " + totalLinks);
	        System.out.println("Links:");
	        for (WebElement link : allLinks) {
	            System.out.println(link.getText());
	        }
	    }

}
