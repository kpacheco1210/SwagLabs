package seleniumgluecode.pageSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import seleniumgluecode.TestBase;

public class LoginPageSteps extends TestBase {

  @When("the user logs in with username {string} and password {string}")
  public void theUserLogsInWithUsernameAndPassword(String username, String password) {
    loginPage.enterUsername(username);
    loginPage.enterPassword(password);

    Assert.assertTrue(loginPage.usernameInputHasValue(username));
    Assert.assertTrue(loginPage.passwordInputHasValue(password));

    loginPage.clickLoginButton();
  }

  @Then("the user should be redirected to the homepage")
  public void theUserShouldBeRedirectedToTheHomepage() {
    Assert.assertEquals("https://www.saucedemo.com/v1/inventory.html", driver.getCurrentUrl());
  }

  @Then("an error message should be displayed")
  public void anErrorMessageShouldBeDisplayed() {
    Assert.assertTrue(loginPage.isErrorButtonDisplayed());
    Assert.assertTrue(loginPage.isInvalidUsernameOrPasswordErrorMessageDisplayed());
  }

  @Then("a locked user error message should be displayed")
  public void aLockedUserErrorMessageShouldBeDisplayed() {
    Assert.assertTrue(loginPage.isErrorButtonDisplayed());
    Assert.assertTrue(loginPage.isLockedOutErrorMessageDisplayed());
  }

}
