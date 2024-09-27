
package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasePage {
  private static final Logger logger = Logger.getLogger(BasePage.class.getName());

  private WebDriver driver;
  private WebDriverWait wait;

  public BasePage(WebDriver driver){
    this.driver = driver;
  }

  /*
   *  --- ACTIONS ---
   */
  public static void sendKeys(WebElement element, String value) {
    try {
      element.sendKeys(value);
    } catch (Exception e) {
      Assert.fail();
    }
  }

  public static void click(WebElement element) {
    try {
      element.click();
    } catch (Exception e) {
      Assert.fail();
    }
  }

  /*
   *  --- ELEMENT CONDITION ---
   */
  public boolean isDisplayed(WebElement element) {
    try {
      waitForElementToAppear(element);
      return element.isDisplayed();
    } catch (Exception e) {
      logger.log(Level.SEVERE, "Exception occurred while checking if element is displayed", e);
      return false;
    }
  }

  protected void waitForElementToAppear(WebElement element) {
    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOf(element));
  }

  protected void waitForElementToBeClickable(WebElement element){
    wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  protected void waitForElementToDissapear(WebElement element){
    wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    wait.until(ExpectedConditions.invisibilityOf(element));
  }

  protected void waitForVisibilityOfAllElements(List<WebElement> elements){
    wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfAllElements(elements));
  }
  public static void waitFor(int segundos) {
    try {
      Thread.sleep(segundos * 1000);
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }

  /*
   *  --- ELEMENT ATTRIBUTE ---
   */
  public String getText(WebElement element) throws Exception{
    try {
      return element.getText();
    }catch (Exception e){
      throw new Exception("Text from " + element + "not available");
    }
  }

}
