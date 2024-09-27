package runner.driverManager;


import static org.openqa.selenium.remote.Browser.CHROME;
import static org.openqa.selenium.remote.Browser.FIREFOX;

public class DriverManagerFactory {
  public static DriverManager getManager(DriverType type){

    DriverManager driverManager = null;

    switch (type) {
      case CHROME:
        driverManager = new ChromeDriverManager();
        break;
      case FIREFOX:
        driverManager = new FireFoxDriverManager();
        break;
      default:
        System.out.printf("Invalid browser selected");
        break;
    }
    return driverManager;

  }


}