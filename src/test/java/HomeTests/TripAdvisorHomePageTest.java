package HomeTests;

import org.testng.annotations.Test;
import pages.SeleniumDemoHomePage;
import pages.TripAdvisorHomePage;
import utility.TestBase;
import utility.WebdriverUtils;

/**
 * Created by moises.siles on 4/19/2016.
 */
public class TripAdvisorHomePageTest extends TestBase {

    @Test(description = "Selenium Demo Page", groups = {"factory"})
    public void homePageTestLoad() throws Exception{

        WebdriverUtils.goToURL("https://www.tripadvisor.com.mx");
        WebdriverUtils.pauseTime(5000);

        TripAdvisorHomePage tripAdvisorHomePage = new TripAdvisorHomePage(WebdriverUtils.driver);

        tripAdvisorHomePage.printLinksText();
    }
}
