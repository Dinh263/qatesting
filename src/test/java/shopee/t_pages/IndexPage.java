package shopee.t_pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

@DefaultUrl("page:newtours.login.page")
public class IndexPage extends PageObject {
    private static org.slf4j.Logger log = LoggerFactory.getLogger(IndexPage.class);
    public IndexPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//input[@name='userName']")
    private WebElementFacade txtusername;

    @FindBy(xpath="//input[@name='password']")
    private WebElementFacade txtpassword;

    @FindBy(xpath="//input[@name='login']")
    private WebElementFacade btnSignIn;

    @WhenPageOpens
    public void waitUntilSignInButtonVisible(){
        btnSignIn.waitUntilVisible();
    }

    public void setUsername(String userName){
        txtusername.waitUntilVisible();
        txtusername.sendKeys(userName);
    }

    public void setPassword(String password){
        txtpassword.waitUntilVisible();
        txtpassword.sendKeys(password);
    }

    public void setBtnSignIn(){
        btnSignIn.waitUntilVisible();
        btnSignIn.click();
    }

    public void login_to_application(String username, String password){
        setUsername(username);
        setPassword(password);
        setBtnSignIn();
    }

}
