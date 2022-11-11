package tests.checkboxes;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.selenium.practice.constants.Constant.Urls.HOME_PAGE;

public class CheckBoxTests extends BaseTest {

    @Test (testName = "15", priority = 2)
    public void checkboxView() {
        basePage.open(HOME_PAGE);
        loginPage.login();
        homePage.openCheckBoxes()
                .checkboxesSelectedCheck();
    }
}