package pageObjects;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VigeoPage extends BaseClass {

    public static String getTitle() {
        return driver.getTitle();
    }

}
