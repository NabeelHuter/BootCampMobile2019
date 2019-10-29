package homepagetest;

import common.MobileAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MobileAPI {

    HomePage homePage;

    @BeforeMethod
    public void setPageFactory(){
        homePage = PageFactory.initElements(appiumDriver,HomePage.class);

    }

    @Test (enabled = false)
    public void HomePage(){
        homePage.validateINDEED();
    }
    @Test
    public void swipeTest(){
        homePage.scrollHomePage();
    }


}

