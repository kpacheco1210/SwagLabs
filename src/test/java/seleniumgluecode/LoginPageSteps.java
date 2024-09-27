package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends TestBase{

  @When("the user logs in with username {string} and password {string}")
  public void theUserLogsInWithUsernameAndPassword(String arg0, String arg1) {
  }

  @When("the user attempts to log in with invalid username {string} and password {string}")
  public void theUserAttemptsToLogInWithInvalidUsernameAndPassword(String arg0, String arg1) {
  }

  @Then("the user should be redirected to the homepage")
  public void theUserShouldBeRedirectedToTheHomepage() {
    // Write code here that turns the phrase above into concrete actions
  }

  @Then("an error message should be displayed")
  public void anErrorMessageShouldBeDisplayed() {
    // Write code here that turns the phrase above into concrete actions
  }

}
