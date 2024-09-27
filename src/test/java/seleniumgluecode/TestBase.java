package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.pages.LoginPage;

public class TestBase {
  protected WebDriver driver = Hooks.getDriver();
  protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

}