package objectRepo;

import org.openqa.selenium.By;

import utilities.DownloadBaseClass;

public class DownloadHomePageOR extends DownloadBaseClass{
 
	public static By testingFormPage = By.xpath("//a[text()='Testing Form Page']");
	
	public static void clickTestingFormPage() {
		click(testingFormPage);
	}
	
}
