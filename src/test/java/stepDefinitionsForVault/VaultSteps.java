package stepDefinitionsForVault;

import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class VaultSteps {
    @Given("^I navigate to the Vault log in page$")
    public void NavigateToVault() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I type in \"([^\"]*)\" as my user name$")
    public void TypeUserName(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I also type in \"([^\"]*)\" as my password$")
    public void TypePassWord(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be able to see the Vault homepage$")
    public void AssertLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}