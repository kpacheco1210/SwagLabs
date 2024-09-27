package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import runner.driverManager.DriverManager;
import runner.driverManager.DriverManagerFactory;
import runner.driverManager.DriverType;

public class Hooks {

  private static WebDriver driver;
  private DriverManager driverManager;
  @Before
  public void setUp() {
    driverManager = DriverManagerFactory.getManager(DriverType.CHROME); //get the manager
    driver = driverManager.getDriver(); // get the driver from the driver manager
    driver.manage().window().maximize();
  }

  @After
  public void teadDown(){
    driverManager.quitDriver();
  }

  public static WebDriver getDriver(){
    return driver;
  }

}