package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.BasePage;
import java.util.List;

public class HomePage extends BasePage {

  @FindBy(xpath = "//div[@class='app_logo']")
  private WebElement appLogo;

  @FindBy(xpath = "//div[@class='header_secondary_container']")
  private WebElement headerSecondaryContainer;

  @FindBy(xpath = "//div[contains(text(),'Products')]")
  private WebElement productLabel;

  @FindBy(xpath = "//select[@class='product_sort_container']")
  private WebElement sortDropdown;

  @FindBy(xpath = "//div[@class='inventory_item']")
  private List<WebElement> allProducts;

  public HomePage(WebDriver driver) {
        super(driver);
  }

  public boolean isAppLogoDisplayed() {
    return isDisplayed(appLogo);
  }

  public boolean isHeaderSecondaryContainerDisplayed() {
    return isDisplayed(headerSecondaryContainer);
  }

  public boolean isProductLabelDisplayed() {
    return isDisplayed(productLabel);
  }

  public boolean isSortDropdownDisplayed() {
    return isDisplayed(sortDropdown);
  }

  public boolean allProductsAreDisplayed() {
    return allProducts.stream().allMatch(WebElement::isDisplayed);
  }




}
