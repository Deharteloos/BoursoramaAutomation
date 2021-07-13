package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.ISRFundsPage;
import pageObjects.StockExchangePage;
import pageObjects.VigeoPage;

import java.io.IOException;

public class CucumberHooks extends BaseClass {
    @Before
    public void setup(){
        setUpDriver();
        //Init Page Elements here
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, StockExchangePage.class);
        PageFactory.initElements(driver, ISRFundsPage.class);
        PageFactory.initElements(driver, VigeoPage.class);
    }
    @After
    public void teardown() throws IOException {
        closeDriver(driver);

        /*
          Live the following block commented until all tests are being executed correctly
          */
        /*
        SendMail sendMail = new SendMail();
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "gtendong@gmail.com");
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "fokourou@zenity.fr");
         */
    }

}

