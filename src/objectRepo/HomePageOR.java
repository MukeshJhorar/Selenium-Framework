package objectRepo;

import org.openqa.selenium.By;

import utilities.ByBaseClass;

public class HomePageOR extends ByBaseClass{

	public static By testingFormPage = By.xpath("//*[text() = 'Testing Form Page']");
	public static By xPathOperators  = By.xpath("//*[text() = 'Xpath Operators']");
	
	public static void clickTestingFormPage() {
	
		click(testingFormPage);
	}
}
