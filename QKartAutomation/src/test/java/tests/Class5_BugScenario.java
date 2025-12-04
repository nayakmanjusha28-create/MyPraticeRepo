package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.Reusable;
public class Class5_BugScenario extends BaseTest {

    @Test
    public void verifyPaymentMethodsBug() {
        Reusable reusable = new Reusable(driver);

        // 1️⃣ Login first (if not already logged in)
        reusable.clickElement(By.xpath("//button[text()='Login']"));
        reusable.enterText(By.id("username"), prop.getProperty("username"));
        reusable.enterText(By.id("password"), prop.getProperty("password"));
        reusable.clickElement(By.xpath("//button[text()='Login to QKart']"));

        // 2️⃣ Add first product to cart
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstProductAddBtn = By.xpath("//button[text()='Add to cart'][1]");
        wait.until(ExpectedConditions.elementToBeClickable(firstProductAddBtn));
        reusable.clickElement(firstProductAddBtn);

        // 3️⃣ Go to Cart / Checkout
        By checkoutBtn = By.xpath("//button[text()='Checkout']");
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));
        reusable.clickElement(checkoutBtn);

        // 4️⃣ Validate Payment section
        By paymentHeader = By.xpath("//h4[text()='Payment']");
        By paymentMethodsText = By.xpath("//p[text()='Payment Method']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentHeader));
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentMethodsText));

        Assert.assertTrue(reusable.isDisplayed(paymentHeader), "Payment text not displayed");
        Assert.assertTrue(reusable.isDisplayed(paymentMethodsText), "Payment Methods text not displayed");

        // 5️⃣ Validate that no selectable options exist
        int paymentOptions = reusable.countElements(By.xpath("//input[@type='radio' or @type='checkbox']"));
        Assert.assertEquals(paymentOptions, 0, "Bug: Payment options are present, should not be selectable");

        System.out.println("Bug detected: Payment methods are displayed in text only, no selectable options.");
    }
}
