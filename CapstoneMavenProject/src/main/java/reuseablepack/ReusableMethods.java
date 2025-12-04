package reuseablepack;

import org.openqa.selenium.WebElement;

public class ReusableMethods {

    public static boolean isElementClickable(WebElement element) {
        return element.isDisplayed() && element.isEnabled();
    }

    @SuppressWarnings("deprecation")
	public static String getPlaceholder(WebElement element) {
        return element.getAttribute("placeholder");
    }
}
