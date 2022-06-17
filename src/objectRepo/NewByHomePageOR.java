package objectRepo;

import org.openqa.selenium.By;

import utilities.NewByBaseClass;

public class NewByHomePageOR extends NewByBaseClass{

	public static By testingFormPage = By.xpath("//a[text()='Testing Form Page']");
	public static By xPathOperator = By.xpath("//a[text()='Xpath Operators']");
	
	public static void clickTestingFormpage(){
		click(testingFormPage);
	}
}
