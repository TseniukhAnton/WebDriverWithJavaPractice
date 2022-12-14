package tests.home;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.selenium.practice.constants.Constant.Urls.HOME_PAGE;

public class HomePageTests extends BaseTest {

    @Test(testName = "HomePageViewCheck", priority = 1, groups = {"regression"})
    public void checkHomePageView() {
        basePage.open(HOME_PAGE);

        loginPage.login()
                .checkHomePageView();
    }
}
