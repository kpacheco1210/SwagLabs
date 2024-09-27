package seleniumgluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Background extends TestBase {

  @Given("the user navigates to the login page")
  public void theUserNavigatesToTheLoginPage() {
    driver.get("https://www.saucedemo.com/v1/");

    Assert.assertEquals("Swag Labs", driver.getTitle());
    Assert.assertEquals("https://www.saucedemo.com/v1/", driver.getCurrentUrl());
  }

  @And("the login page is displayed displayed properly")
  public void theLoginPageShouldBeDisplayedProperly() {
    Assert.assertTrue(loginPage.isLoginLogoDisplayed());
    Assert.assertTrue(loginPage.isUsernameInputDisplayed());
    Assert.assertTrue(loginPage.isPasswordInputDisplayed());
    Assert.assertTrue(loginPage.isLoginButtonDisplayed());

  }
}
