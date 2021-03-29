package StepDef;

import Pages.SupplyBrainPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupplyBrainTest {
    SupplyBrainPage SupplyPage = new SupplyBrainPage();


    @Given("User on Login Page")
    public void user_on_Login_Page() {
//        Driver.get().get(ConfigurationReader.getProperty("url"));
        SupplyPage.url();

    }

    @When("User enter username and password")
    public void user_enter_username_and_password() {
        SupplyPage.enterEmailAdnPassword();

    }

    @When("user click on the login button")
    public void user_click_on_the_login_button() {

        SupplyPage.login();

    }}