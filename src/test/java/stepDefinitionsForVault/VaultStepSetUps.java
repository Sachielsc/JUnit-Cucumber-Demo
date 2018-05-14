package stepDefinitionsForVault;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import vaultProject.pageobjects.LoginPage;

public class VaultStepSetUps {

    // variable definitions
    public static WebDriver driver;
    public static LoginPage loginPage;

    @Before("@LoginSuccess")
    public void init(){
        driver = Driver.getWebDriver();
        loginPage = new LoginPage(driver);
    }

    @After("@LoginSuccess")
    public void tearDown(){
        Driver.quitWebDriver();
    }
}