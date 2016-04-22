package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.WebdriverUtils;


/**
 * Created by moises.siles on 4/19/2016.
 */
public class SeleniumDemoHomePage {

    @FindBy(css=".wpb_wrapper>h2>span>strong")
    WebElement demoTitle;

    @FindBy(css=".submit")
    WebElement searchIcon;

    public SeleniumDemoHomePage(WebDriver driver){
        WebdriverUtils.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void getDemoTitle()throws Exception{
        System.out.println(demoTitle.getText());
    }
}
