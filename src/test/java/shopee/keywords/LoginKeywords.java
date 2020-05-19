package shopee.keywords;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import shopee.steps.LoginSteps;

public class LoginKeywords {
    @Steps
    private LoginSteps loginSteps;

    @Given("that the user is on index page")
    public void user_goes_to_the_index_page(){
        loginSteps.go_to_the_index_page();
    }

    @When("the user logins with correct credential")
    public void user_logins_to_application(){
        String username = "dinh.test263";
        String password = "123456";
        loginSteps.login_to_application_with_email_and_password(username, password);
    }

    @Then("the user can log in to application successfully")
    public void assert_user_login_successfully(){
        String expectedPageTitle = "Find a Flight: Mercury Tours:";
        loginSteps.assert_the_login_is_successfully(expectedPageTitle);
    }


}
