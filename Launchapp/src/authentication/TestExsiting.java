package authentication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestExsiting {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://bs4485:Bangalore!@ftms-qa-hsb.dupont.com/FTMS/");
	//Thread.sleep(3000);
Pageobjectmodel p = new Pageobjectmodel(driver);
p.ClickOnHomeButton();
p.ClickonPlans();
p.ClickonBiologyPlan();
	 driver.findElement(By.xpath("(//tr[@class='protocol-row IE8-zebra-row'])[1]"));
	 Thread.sleep(3000);
	 Actions ac= new Actions(driver);
	 ac.doubleClick().perform();
}
}
