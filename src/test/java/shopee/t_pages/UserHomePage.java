package shopee.t_pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

public class UserHomePage extends PageObject {
    private static org.slf4j.Logger log = LoggerFactory.getLogger(UserHomePage.class);
    public UserHomePage(WebDriver driver){
        super(driver);
    }


    public String get_title_of_the_page(){
        return getDriver().getTitle();
    }


}
