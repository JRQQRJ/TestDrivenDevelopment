package stepDefinitions;

import com.automationbytarun.browser.DriverManager;
import com.automationbytarun.components.BaseActions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import stepDefinitions.LoginStepDefinition;
import pages.WelcomePage;

public class WelcomeStepDefinition {



    WebDriver driver;
    public BaseActions pageActions;
    WelcomePage welcomePage;


    @Then("I should see the Welcome Page")
    public void iShouldSeeTheWelcomePage() throws InterruptedException {
        LoginStepDefinition loginStepDefinition =new LoginStepDefinition();
        driver = loginStepDefinition.rD();

        pageActions = new BaseActions(driver);
        welcomePage = new WelcomePage(driver);
//      System.out.println(driver.getCurrentUrl());
        String welcomMsg = welcomePage.getWelcomeMessage();
        System.out.println("sambar");
        System.out.println(welcomMsg);
        Thread.sleep(3000);

//        TestAsserts.checkIfValuesAreEqual(welcomMsg,welcomMsg);
//        TestAsserts;

        }
    }

