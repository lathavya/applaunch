package applaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//	Thread.sleep(5000);
		
	Runtime.getRuntime().exec("d:\\Desktop\\Autoitscripts\\Applaunch1.exe");

		driver.get("http://ftms-qa-hsb.dupont.com/FTMS/");
/*		WebDriverWait wait = new WebDriverWait(driver, 5);
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());   
//		alert.sendKeys("bs4485");
////		alert.authenticateUsing(new UserAndPassword("bs4485", "Banglore!"));
//		alert.accept();*/

		
		
	   /* String userName = "Username";
	    StringSelection stringSelection = new StringSelection(userName);
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, stringSelection);

	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);

	    String password = "password";
	    StringSelection stringSelection1 = new StringSelection(password);
	    Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard1.setContents(stringSelection1, stringSelection1);


	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);

	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);*/

	}

}
