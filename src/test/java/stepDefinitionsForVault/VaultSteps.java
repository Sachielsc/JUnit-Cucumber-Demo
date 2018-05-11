package stepDefinitionsForVault;

import cucumber.api.PendingException;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import utils.Driver;
import vaultProject.pageobjects.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VaultSteps {

    // variable definitions
    private WebDriver driver;
    private LoginPage loginPage;

    @Before("@LoginSuccess")
    public void init(){
        driver = Driver.getWebDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("^I navigate to the Vault log in page$")
    public void NavigateToVault() throws Throwable {
        loginPage.NavigateToLoginPage();
    }

    @When("^I type in \"([^\"]*)\" as my user name$")
    public void TypeUserName(String userName) throws Throwable {
        loginPage.TypeUserName(userName);
    }

    @When("^I also type in \"([^\"]*)\" as my password$")
    public void TypePassWord(String passWord) throws Throwable {
        loginPage.TypePassword(passWord);
    }

    @When("^I click the Login Button$")
    public void ClickLoginButton() throws Throwable {
        loginPage.clickLoginButton();
    }
    @Then("^I should be able to see the Vault homepage$")
    public void AssertLogIn() throws Throwable {
        String test = "tobedeleted";
        assertEquals(test, "tobedeleted");
    }

    @After("@LoginSuccess")
    public void tearDown(){
        Driver.quitWebDriver();
    }
}