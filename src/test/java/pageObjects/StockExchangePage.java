package pageObjects;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StockExchangePage extends BaseClass {
    private static final String link = "https://boursorama.com/bourse";

    @FindBy(xpath = "/html/body/div[5]/div[3]/nav/ul/li[2]/ul/li[7]/ul/li[6]/a")
    private static WebElement ISRlink;

    public static void goToPage() {
        driver.get(link);
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static void navigateToISR() {
        navigateTo(ISRlink);
    }
}
