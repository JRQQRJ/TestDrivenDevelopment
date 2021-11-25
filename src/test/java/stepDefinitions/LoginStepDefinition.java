package stepDefinitions;

import com.automationbytarun.components.BaseActions;
import com.automationbytarun.components.TestActions;
import com.automationbytarun.helpers.TestAsserts;
import com.automationbytarun.properties.PropertiesLoader;
import com.automationbytarun.properties.PropertiesValidator;
import com.automationbytarun.browser.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.WelcomePage;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition extends TestActions  {

    WebDriver driver;
    DriverManager driverManager;
    public BaseActions pageActions;
    LoginPage loginPage;
    WelcomePage welcomePage;

    @Given("I am at the login page")
    public void iAmAtTheLoginPage() throws Exception {
        PropertiesLoader.initializeProperties();
        PropertiesValidator.validateConfigurations();
        driverManager=new DriverManager();
        driverManager.loadDriver();
        driver=driverManager.getDriver();
        pageActions = new BaseActions(driver);
        loginPage=new LoginPage(driver);
        pageActions.launchUrl(PropertiesLoader.appUrl);
    }

//    @When("I login to the application")
//    public void iLoginToTheApplication() throws InterruptedException {
//        loginPage.enterUserName("Admin")
//                .enterPassword("admin123")
//                .clickLogin();
//        Thread.sleep(3000);
//    }

    @When("I enter {string} and {string} and submit")
    public void iEnterAndAndSubmit(String arg0, String arg1) throws InterruptedException {
        loginPage.enterUserName(arg0);
        System.out.println(arg0);
        loginPage.enterPassword(arg1);
        System.out.println(arg1);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("I should see the Welcome Page")
    public void iShouldSeeTheWelcomePage() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        String welcomMsg = welcomePage.getWelcomeMessage();
        System.out.println(welcomMsg);
        Thread.sleep(3000);
//        TestAsserts
//
//        TestAsserts.checkIfValuesAreEqual(welcomMsg,welcomMsg);
//        TestAsserts;

    }


    @When("I enter {string} and {string} and try submit")
    public void iEnterAndAndTrySubmit(String arg0, String arg1) throws InterruptedException {
        System.out.println(arg0);
        System.out.println(arg1);
                loginPage.enterUserName(arg0)
                .enterPassword(arg1)
                .clickLogin();
        Thread.sleep(3000);
    }

    @Then("I should not see the Welcome Page")
    public void iShouldNotSeeTheWelcomePage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("validate"));
    }


    }



