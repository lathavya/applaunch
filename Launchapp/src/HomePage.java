package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath="//span[.='Home']")
	private WebElement Homebutton;
    @FindBy(xpath="(//a[.='Plans'])[1]")
    private WebElement Plans;
    @FindBy(xpath="(//a[.='Biology Plan'])[1]")
    private WebElement BiologyPlan;
    
    public HomePage(WebDriver driver){
    	PageFactory.initElements(driver, this);
    	}

public void ClickOnHomeButton(){
	Homebutton.click();
	}

public void verifyHomePage(String title){
	Verifytitle(title);
}
}
