package pageObjects;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ISRFundsPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div[4]/div[1]/div[8]/p/a")
    private static WebElement goToVigeo;

    public static String getTitle() {
        return driver.getTitle();
    }

    public static void goToVigeoPage() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1300);");
        navigateTo(goToVigeo);
    }
}
