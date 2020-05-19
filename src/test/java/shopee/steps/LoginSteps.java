package shopee.steps;

import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopee.t_pages.IndexPage;
import shopee.t_pages.UserHomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {
    private static Logger log = LoggerFactory.getLogger(LoginSteps.class);

    private IndexPage indexPage;
    private UserHomePage userHomePage;

    @Step
    public void go_to_the_index_page(){
        indexPage.open();
    }

    @Step
    public void login_to_application_with_email_and_password(String userName, String password){
        indexPage.login_to_application(userName, password);
    }

    @Step
    public void assert_the_login_is_successfully(String expectedPageTitle){
        String actualPageTile = userHomePage.get_title_of_the_page();
        assertThat(actualPageTile).as("Login is not successfully! ").isEqualTo(expectedPageTitle);
    }
}
