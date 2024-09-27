package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.BasePage;
import java.util.Objects;

public class LoginPage extends BasePage {

  @FindBy(xpath = "//div[@class='login_logo']")
  private WebElement loginLogo;

  @FindBy(xpath = "//input[@data-test='username']")
  private WebElement usernameInput;

  @FindBy(xpath = "//input[@data-test='password']")
  private WebElement passwordInput;

  @FindBy(xpath = "//input[@id='login-button']")
  private WebElement loginButton;

  @FindBy(xpath = "//h3[@data-test='error']")
  private WebElement errorMessage;

  @FindBy(xpath = "//button[@class='error-button']")
  private WebElement errorButton;

  public LoginPage(WebDriver driver) {super(driver);}

  public boolean isLoginLogoDisplayed() { return isDisplayed(loginLogo);}

  public boolean isUsernameInputDisplayed() {
    return isDisplayed(usernameInput);
  }

  public boolean isPasswordInputDisplayed() {
    return isDisplayed(passwordInput);
  }

  public boolean isLoginButtonDisplayed() {
    return isDisplayed(loginButton);
  }

  public void enterUsername(String username) {
    sendKeys(usernameInput, username);
  }

  public boolean usernameInputHasValue(String value) {
    return Objects.equals(usernameInput.getAttribute("value"), value);
  }

  public void enterPassword(String password) {
    sendKeys(passwordInput, password);
  }

  public boolean passwordInputHasValue(String value) {
    return Objects.equals(passwordInput.getAttribute("value"), value);
  }

  public void clickLoginButton() {
    click(loginButton);
  }

  public boolean isInvalidUsernameOrPasswordErrorMessageDisplayed() {
    isDisplayed(errorMessage);
    return errorMessage.getText().contains("Epic sadface: Username and password do not match any user in this service");
  }

  public boolean isLockedOutErrorMessageDisplayed() {
    isDisplayed(errorMessage);
    return errorMessage.getText().contains("Epic sadface: Sorry, this user has been locked out");
  }

  public boolean isErrorButtonDisplayed() {
    return isDisplayed(errorButton);
  }


}
