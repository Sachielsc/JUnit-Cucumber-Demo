package stepDefinitionsForVault;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import vaultProject.pageobjects.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import utils.ExtentManager;

public class VaultStepSetUps {

    // variable definitions
    public static WebDriver driver;
    public static LoginPage loginPage;

    // ExtentReports variable definitions
    public static ExtentReports extent;
    public static ExtentTest test;

    @Before("@LoginSuccess")
    public void init(Scenario scenario){
        // selenium initialization
        driver = Driver.getWebDriver();
        loginPage = new LoginPage(driver);

        // ExtentReporter initialization
        extent = ExtentManager.GetExtent();
        test = extent.createTest(scenario.getName());
    }

    @After("@LoginSuccess")
    public void tearDown(){
        Driver.quitWebDriver();
        extent.flush();
    }
}