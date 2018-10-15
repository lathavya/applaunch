package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BiologyPlanDetails {
	private WebElement Project;
    @FindBy(xpath="(//input[@type='search'])[2]")
    private WebElement Projectname;
    @FindBy(xpath="(//select[@class='form-control'])[4]")
    private WebElement Region;
    @FindBy(xpath="(//select[@class='form-control'])[5]")
    private WebElement InitiationYear;
    @FindBy(xpath="(//span[@role='combobox'])[2]")
    private WebElement profoliocode;
    @FindBy(xpath="//textarea[@name='name']")
    private WebElement Name;
    @FindBy(xpath="(//span[@role='combobox'])[3]")
    private WebElement ProjectLead;
    @FindBy(xpath="//span[.='No']")
    private WebElement NO;
    @FindBy(xpath="(//button[@class='btn btn-default'])[19]")
    private WebElement Save;
    public BiologyPlanDetails(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void ClickonProject(){
    	Project.click();
    }
    public void SendProjectname(String PN){
    	Projectname.sendKeys(PN);
    	}
    public void SelectRegion(){
    	Region.click();
    	Select s = new Select(Region);
    	s.selectByVisibleText("AP");;
    }
    public void SelectInitationYear(){
    	InitiationYear.click();
    	Select s = new Select(InitiationYear);
    	s.selectByVisibleText("2018");
    }
    public void Selectprofoliocode(){
    	profoliocode.click();
    }
    public void EnterName(String N){
    	Name.sendKeys(N);
    }
    public void SelectProjectlead(){
    	ProjectLead.click();
    }
    public void SelectNo(){
    	NO.click();
    }
    public void ClickonSave(){
    	Save.click();
    }


}
