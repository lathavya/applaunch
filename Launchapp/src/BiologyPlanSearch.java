package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiologyPlanSearch {
	@FindBy(xpath="//a[@name='CreateNewBiologyPlan']")
    private WebElement CreateNew;
    

public BiologyPlanSearch(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void CreateNewBiologyplan(){
	CreateNew.click();
}
    

}
