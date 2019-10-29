package homepage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class HomePage extends MobileAPI {


    @FindBy(xpath = "//android.widget.Button[@text='Find Jobs']")
    WebElement findjobs;

    @FindBy(xpath = "//android.view.View[@text='Sign in']")
    WebElement signin;

    @FindBy(xpath = "//android.view.View[@text='Create your resume Let employers find you']")
    WebElement createresume;

    @FindBy(xpath = "///android.view.View[@text='My Jobs']")
    WebElement myjobs;


    public void validateINDEED() {

        SoftAssert softAssertion = new SoftAssert();

        softAssertion.assertEquals(findjobs.isDisplayed(), true, "findjobs isn't displayed");
        softAssertion.assertEquals(signin.isDisplayed(), true, "signin isn't displayed");
        softAssertion.assertEquals(createresume.isDisplayed(), true, "createresume isn't displayed");
        softAssertion.assertEquals(myjobs.isDisplayed(), true, "myjobs isn't displayed");

        softAssertion.assertAll();

    }

    public void clickfindjobs() {
        sleepFor(5);
        findjobs.click();
    }

    public void clicksignin() {
        sleepFor(5);
        signin.click();
    }

    public void clickcreateresume() {
        sleepFor(5);
        createresume.click();
    }

    public void clickmyjobs() {
        sleepFor(5);
        myjobs.click();
    }

    public void scrollHomePage() {
        sleepFor(5);
        functionSwipe("up", 200, 200);
        sleepFor(5);

    }
}

