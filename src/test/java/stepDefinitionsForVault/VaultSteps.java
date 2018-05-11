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
    private HomePage homePage;

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

    @Then("^I should be able to see the Vault homepage, with a URL: \"([^\"]*)\"$")
    public void HomePageAssertion(String expectedHomePageURL) throws Throwable {
        homePage = new HomePage(driver);
        homePage.WaitUntilHomePageLoadingComplete();
        assertEquals(expectedHomePageURL, homePage.GetCurrentURL());
        assertEquals(expectedHomePageURL, driver.getCurrentUrl());
        System.out.print("\nConsole output:\n");
        System.out.print("Current driver has a URL of: " + driver.getCurrentUrl() + "\nCurrent page has a URL of: " + homePage.GetCurrentURL());
        System.out.print("\n");
    }

    @After("@LoginSuccess")
    public void tearDown(){
        Driver.quitWebDriver();
    }
}