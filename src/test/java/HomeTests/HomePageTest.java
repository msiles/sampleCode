package HomeTests;

import org.testng.annotations.Test;
import pages.SeleniumDemoHomePage;
import utility.TestBase;
import utility.WebdriverUtils;

/**
 * Created by moises.siles on 4/19/2016.
 */
public class HomePageTest extends TestBase {

    @Test(description = "", groups = {"factory"})
    public void homePageTestLoad() throws Exception{

        WebdriverUtils.goToURL("http://www.seleniumframework.com/demo-sites/");
        WebdriverUtils.pauseTime(5000);

        SeleniumDemoHomePage seleniumDemoHomePage = new SeleniumDemoHomePage(WebdriverUtils.driver);

        seleniumDemoHomePage.getDemoTitle();
    }
}
