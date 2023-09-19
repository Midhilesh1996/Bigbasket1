package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class HomePage1 extends WebTestBase {
    public HomePage1(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//span[text()='Category'])[2]")
    WebElement shopByCategory;
    @FindBy(xpath = "(//a[text()='Fruits & Vegetables'])[2]")
    WebElement vegAndFruits;
    @FindBy(xpath = "(//input[@class='flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700'])[1]")
    WebElement search;
    @FindBy(xpath = "//span[text()='Relevance']")
    WebElement relevance;
    @FindBy(xpath = "//span[text()='Price - Low to High']")
    WebElement price;
    public void clickOnCategory(){
        shopByCategory.click();
    }

    public void clickOnFruits(){
        vegAndFruits.click();
    }

    public void sendKeysForSearch(String keyword){
        search.sendKeys(keyword);
    }

    public void clickOnRelevance(){
        relevance.click();
    }

    public void clickOnLowToHigh(){
        price.click();
    }

}
