package stepDefinitions;

import functionLibrary.commonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.homePage;

public class AppointmentBooking extends commonFunctions{
    LoginPage login= new LoginPage();
    homePage homepage = new homePage();

    public AppointmentBooking() throws InterruptedException {
    }

    @Given("I should open url")
    public void i_should_open_url() throws InterruptedException {
        login.launchCURAApp();
        login.maximizeBrowser();
    }

    @When("I click on Appointment page")
    public void i_click_on_appointment_page() throws InterruptedException {
        homepage.appointmentClick();
    }
    @When("I enter a valid username")
    public void i_enter_a_valid_username() throws InterruptedException {
        login.enterUserName();
    }

    @When("I enter a valid password")
    public void i_enter_a_valid_password() {
        login.enterPassword();
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        login.clickLogInBtn();
    }

    @Then("I should enter to Login Page")
    public void i_should_enter_to_login_page() throws InterruptedException {
        homepage.loginPageValidation();
    }

    @Then("I should log in successfully to homepage")
    public void i_should_log_in_successfully_to_homepage() throws InterruptedException {
        homepage.homePageValidation();
    }
    @When("I enter Appointment Details")
    public void i_enter_appointment_details() throws InterruptedException {
        homepage.enterAppointmentDetails();
    }

    @Then("I should be able to book Appointment successfully")
    public void i_should_be_able_to_book_appointment_successfully() {
        homepage.validateAppointmentConfirmation();
    }
    @Then("I should Log out")
    public void i_should_log_out() {
        homepage.logOut();
    }

}

