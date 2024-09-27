package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.BasePage;

public class LoginPage extends BasePage {


  @FindBy(xpath = "//div[@class='login_logo']")
  private WebElement loginLogo;

  @FindBy(xpath = "//input[@data-test='username']")
  private WebElement usernameInput;

  @FindBy(xpath = "//input[@data-test='password']")
  private WebElement passwordInput;

  @FindBy(xpath = "//input[@id='login-button']")
  private WebElement loginButton;

  public LoginPage(WebDriver driver) {super(driver);}

  public boolean isLoginLogoDisplayed() {
    return isDisplayed(loginLogo);
  }

  public boolean isUsernameInputDisplayed() {
    return isDisplayed(usernameInput);
  }

  public boolean isPasswordInputDisplayed() {
    return isDisplayed(passwordInput);
  }

  public boolean isLoginButtonDisplayed() {
    return isDisplayed(loginButton);
  }


}
