package pageObjects;

import functionLibrary.commonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static functionLibrary.commonFunctions.driver;

public class LoginPage extends commonFunctions {
    public LoginPage() throws InterruptedException {
        PageFactory.initElements(driver, this);}

        @FindBy(id= "txt-username")
        public WebElement username;

        @FindBy(id= "txt-password")
        public WebElement password;

        @FindBy(id="btn-login")
        public WebElement logInBtn;


        public void enterUserName(){
            username.sendKeys("John Doe");
        }
        public void enterPassword(){
            password.sendKeys("ThisIsNotAPassword");
        }
        public void clickLogInBtn() {
            logInBtn.click();
        }
}

