package pageObjects;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {
    public static final String link = "https://boursorama.com";

    @FindBy(id = "login-member")
    private static WebElement memberSpaceBtn;

    @FindBy(xpath = "/html/body/div[6]")
    private static WebElement memberLoginDialog;

    @FindBy(id = "login_member_login")
    private static WebElement memberLoginInput;

    @FindBy(id = "login_member_password")
    private static WebElement memberPasswordInput;

    @FindBy(id = "login_member_connect")
    private static WebElement memberLoginBtn;

    @FindBy(xpath = "//*[@id=\"profile\"]/div[2]/span")
    private static WebElement profileName;

    public static void goToPage() {
        driver.get(link);
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static boolean clickOnMemberSpace() {
        memberSpaceBtn.click();
        return memberLoginDialog.getAttribute("class").contains("is-visible");
    }

    public static void memberConnection(String login, String pwd) {
        memberLoginInput.sendKeys(login);
        memberPasswordInput.sendKeys(pwd);
        memberLoginBtn.click();
    }

    public static String getProfileName() {
        return profileName.getText().trim();
    }
}
