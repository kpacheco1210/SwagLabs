package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;
import pom.pages.LoginPage;

public class TestBase {
  protected WebDriver driver = Hooks.getDriver();
  protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
  protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
}