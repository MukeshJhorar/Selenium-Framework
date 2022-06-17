package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ByBaseClass {

	public static WebDriver driver;
	
	public static void openBrowser(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println(browserName  + " browser is up and running ");
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Unable to launch browser : - "+browserName);
			
		}
	}
	

	public static void openURL() {
		try {
			driver.get("https://seleniumautomationpractice.blogspot.com/");
			System.out.println("Application is up and running");
		} catch (Exception e) {
			System.out.println("Unable to open URL : - "+e.getMessage());
		}
	}
	
	
	public static void enterText(By locName, String data) {
		try {
			driver.findElement(locName).clear();
			driver.findElement(locName).sendKeys(data);
			System.out.println("Entered the  - "+data+" enter the textBox having locator : - "+locName);
		} catch (Exception e) {
			System.out.println("Unable to entered the value into the textbox having locator : - "+locName);
		}
	}
	
	public static void click(By locName) {
		try {
			driver.findElement(locName).click();
			System.out.println("Clicked on the element having locator  :- "+locName);
		} catch (Exception e) {
			System.out.println("Unable to click on the element having locator  : - " +locName);
		}
	}
	
	
	public static void clickLink(By locName) {
		try {
			driver.findElement(locName).click();
			System.out.println("Clcik on the element having locator : - " +locName);
		} catch (Exception e) {
			System.out.println("Unable to clicked on the element having locator : - " +locName);
		}
	}
	
	
	public static void select(By locName, String data) {
		try {
			new Select(driver.findElement(locName)).selectByVisibleText(data);
			System.out.println("Select the : - "+data+" using : - "+locName);
		} catch (Exception e) {
			System.out.println("Unable to select the : - "+data+" using : - "+locName);
		}
	}
	
	
	public static void select(By locName, int indexNo) {
		try {
			new Select(driver.findElement(locName)).selectByIndex(indexNo);
			System.out.println("Select the option having index position : - "+indexNo+" using : - "+locName);
		} catch (Exception e) {
			System.out.println("Unable to select the option having index position : - "+indexNo+" using : - "+locName);
		}
	}	
	
	
	public static void commonWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	
	public static void shuttingDown() {
		driver.quit();
		System.out.println("Quetting the execution process");
	}
	
	public static void alertAction(String action) {
		try {
			if(action.equalsIgnoreCase("ok")) {
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			}
			else if(action.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("Error in performing action on Alert box : "+action+" fail");
		}
	}
	
	
	
	
}
