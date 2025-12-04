package tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import utils.Reusable;
public class Class2_ImageLinkTest extends BaseTest {
	  @Test
	    public void verifyImagesAndLinks() {
	        Reusable reusable = new Reusable(driver);

	        int totalImages = reusable.countElements(By.tagName("img"));
	        int totalLinks = reusable.countElements(By.tagName("a"));

	        System.out.println("Total Images: " + totalImages);
	        System.out.println("Total Links: " + totalLinks);

	        Assert.assertTrue(totalImages > 0, "No images found on homepage");
	        Assert.assertTrue(totalLinks > 0, "No links found on homepage");
	    }
	}
