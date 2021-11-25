package pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseActions {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }


    public LoginPage enterUserName(String username){

        typeInto("pages.LoginPage.tbx_Username",username);
        return this;

    }

    public LoginPage enterPassword(String password){

        typeInto("pages.LoginPage.tbx_Password",password);
        return this;

    }

    public WelcomePage clickLogin(){

        clickIt("pages.LoginPage.tbx_btn_Submit");
        return new WelcomePage(driver);

    }

}
