package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.ISRFundsPage;
import pageObjects.StockExchangePage;
import pageObjects.VigeoPage;

public class UnavailablePageSteps {
    @Given("User on the home page")
    public void user_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        HomePage.goToPage();
        HomePage.cookieModalHandler();
        String expectedTitle = "Actualité économique, Bourse, Banque en ligne - Boursorama";
        String actualTitle = HomePage.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Not the page title expected");
    }
    @When("User logged in with {string} and {string}")
    public void user_logged_in_with_and(String login, String password) {
        // Write code here that turns the phrase above into concrete actions
        if(HomePage.clickOnMemberSpace())
            HomePage.memberConnection(login, password);
        Assert.assertEquals(HomePage.getProfileName(), login);
    }
    @And("User go to page ISR funds")
    public void user_go_to_page_isr_funds() {
        // Write code here that turns the phrase above into concrete actions
        StockExchangePage.goToPage();
        Assert.assertEquals(StockExchangePage.getTitle(), "Bourse en direct, Cours actions et dérivés - Boursorama");
        StockExchangePage.navigateToISR();
        Assert.assertEquals(ISRFundsPage.getTitle(), "Fonds ISR, placement et investissement socialement responsable - Boursorama");
    }
    @And("User clicks on the link in ISR indices section")
    public void user_clicks_on_the_link_in_isr_indices_section() {
        // Write code here that turns the phrase above into concrete actions
        ISRFundsPage.goToVigeoPage();
    }
    @Then("The Vigeo requested page should load")
    public void the_vigeo_requested_page_should_load() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertFalse(VigeoPage.getTitle().contains("Page not found"));
    }
}
