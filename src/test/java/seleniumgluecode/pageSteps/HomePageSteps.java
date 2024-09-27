package seleniumgluecode.pageSteps;

import io.cucumber.java.en.And;
import org.junit.Assert;
import seleniumgluecode.TestBase;

public class HomePageSteps extends TestBase {

  @And("the homepage should be displayed properly")
  public void theHomepageShouldBeDisplayedProperly() {
    Assert.assertTrue(homePage.isAppLogoDisplayed());
    Assert.assertTrue(homePage.isHeaderSecondaryContainerDisplayed());
    Assert.assertTrue(homePage.isProductLabelDisplayed());
    Assert.assertTrue(homePage.isSortDropdownDisplayed());
    Assert.assertTrue(homePage.allProductsAreDisplayed());
  }

}
