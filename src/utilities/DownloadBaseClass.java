package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DownloadBaseClass {

	public static WebDriver driver;

	public static void openBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println(browserName + "browser is up and running");
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println(browserName + "browser is up and running");
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (WebDriverException e) {
			System.out.println("Unable to launch" + browserName + "browser" + e.getMessage());
		}
	}

	public static void openUrl(String url) {
		try {
			driver.get(url);
			System.out.println("Opened URl:- " + url);
		} catch (Exception e) {
			System.out.println("Unable to open URL" + e.getMessage());
		}
	}

	public static void enterTxt(By loc, String data) {
		try {
			driver.findElement(loc).clear();
			driver.findElement(loc).sendKeys(data);
			System.out.println("Entered the - " + data + " - into the textbox having locator:- " + loc);
		} catch (Exception e) {
			System.out.println("Unable to Entered the value into the textbox having locator:-" + loc);
		}
	}

	public static void click(By loc) {
		try {
			driver.findElement(loc).click();
			System.out.println("Clicked on the element having locator:- " + loc);
		} catch (Exception e) {
			System.out.println("Unable to click on the element having locator:- " + loc);
		}
	}

	public static void clickLink(By loc) {
		try {
			driver.findElement(loc).click();
			System.out.println("Clicked on the Link having locator:- " + loc);
		} catch (Exception e) {
			System.out.println("Unable to click on the link having locator:- " + loc);
		}
	}

	public static void select(By loc, String data) {
		try {
			new Select(driver.findElement(loc)).selectByVisibleText(data);
			System.out.println("Select the " + data + " using:- " + loc);
		} catch (Exception e) {
			System.out.println("Unable to select the " + data + " using:- " + loc);
		}
	}

	public static void select(By loc, int no) {
		try {
			new Select(driver.findElement(loc)).selectByIndex(no);
			System.out.println("Select the option having index position" + no + " using:- " + loc);
		} catch (Exception e) {
			System.out.println("Unable to select the option having index position" + no + " using:- " + loc);
		}
	}
	
	public static void alertAction(String action) {
		try {
			if (action.equals("ok")) {
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			} else if (action.equals("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("Error in performing action on Alert box:" + action + "Fail");
		}
	}
}
