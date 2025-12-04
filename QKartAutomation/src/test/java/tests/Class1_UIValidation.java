package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import utils.Reusable;
public class Class1_UIValidation extends BaseTest {
	@Test
    public void validateUIElements() {
        Reusable reusable = new Reusable(driver);

        Assert.assertTrue(reusable.isDisplayed(By.xpath("//button[text()='Login']")), "Login button not clickable");
        Assert.assertTrue(reusable.isDisplayed(By.xpath("//button[text()='Register']")), "Register button not clickable");
        Assert.assertTrue(reusable.isDisplayed(By.xpath("//input[@placeholder='Search for items/categories']")), "Search textbox not clickable");
    }
}