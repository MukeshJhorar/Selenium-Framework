package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void openBrowser(String browserName){
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(browserName+ " browser is up and running");
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(browserName + "  browser is up and running");
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge,driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println(browserName + " browser is up and running");
		}
		else {
			System.out.println("Unable to launch " + browserName + " browser");
		}
	}
	
	public static void openAut() {
		try {
			driver.get("https://seleniumautomationpractice.blogspot.com/");
			System.out.println("AUT is up and running");
		} catch (Exception e) {
			System.out.println("Unable to open URL " + e.getMessage());
		}
	}
	
	public static void navigateToUrl(String url) {
		try {
			driver.get(url);
			System.out.println("AUT is up and running");
		} catch (Exception e) {
			System.out.println("Unable to open URL " + e.getMessage());
		}
	}
	
	
	public static void shuttingDown() {
		driver.quit();
		System.out.println("Quetting the execution process");
	}
	
	public static void commonWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void enterText(String locValue, String data) {
		try {
			driver.findElement(By.xpath(locValue)).clear();
			driver.findElement(By.xpath(locValue)).sendKeys(data);
			System.out.println("Enter the  "+ data+ " into the textbox having locator  value  : - "+locValue);
		} catch (Exception e) {
			System.out.println("Unable to entered the value  into textbox having locator : - " +e.getMessage());
			
		}
	}

	public static void click(String locValue) {
		try {
			driver.findElement(By.xpath(locValue)).click();
			System.out.println("Clciked on the element having locator : -  "+locValue);
		} catch (Exception e) { 
			System.out.println("Unable to click on the element  : - "+e.getMessage());
		}
	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	
	
	
	
	
	
}
