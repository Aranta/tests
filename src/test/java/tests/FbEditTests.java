package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.FacebookPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;



@Epic("QA.GURU automation course")
@Story("Facebook tests")
@Tag("fb-test")
class FacebookTests extends TestBase {


    @Test
 //   @Description("Negative test with PageObject, account blocked")


    void unSuccessfulLoginWithPageObject() {
//        Configuration.headless = true;
        String chromeSwitches = System.setProperty("Selenide.Chrome.switches", "--disable-popup-blocking");
        FacebookPage facebookPage = new FacebookPage();

        open(url);

        facebookPage.typeEmail(email);
        facebookPage.typePassword(password);
        facebookPage.clickSubmit();


        facebookPage.verifyLoggedInAsUser("Diana", "Minibaeva");
    }
}
