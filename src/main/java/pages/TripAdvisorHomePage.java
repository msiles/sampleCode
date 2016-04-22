package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utility.WebdriverUtils;

import java.util.List;


/**
 * Created by moises.siles on 4/19/2016.
 */
public class TripAdvisorHomePage {

    @FindBy(css=".svg-taLogo")
    WebElement logoPage;

    @FindBy(css="span[title*='Opini']")
    WebElement opinionLink;

    @FindBy(css=".link.no_cpu")
    List<WebElement> unirseLink;

    @FindBy(css=".link.no_cpu")
    WebElement iniciarSesion;

    @FindAll(@FindBy(css=".link.no_cpu"))
    List<WebElement> headerLinks;

    public TripAdvisorHomePage(WebDriver driver){
        WebdriverUtils.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void printLinksText()throws Exception{
        WebdriverUtils.pauseTime(5000);
        for (int i = 0; i < headerLinks.size(); i++) {
            System.out.println(headerLinks.get(i).getText());
        }

    }
}
