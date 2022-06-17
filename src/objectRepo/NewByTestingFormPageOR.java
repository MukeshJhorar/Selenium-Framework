package objectRepo;

import org.openqa.selenium.By;

import utilities.NewByBaseClass;

public class NewByTestingFormPageOR extends NewByBaseClass{

	public static By fName = By.id("ts_first_name");
	public static By lName = By.id("ts_last_name");
	public static By address = By.id("ts_address");
	public static By nationality = By.xpath("//select[@id='ts_country']");
	public static By male = By.xpath("//input[@value='male']");
	public static By female = By.xpath("//input[@value='female']");
	public static By cricket = By.id("ts_checkbox1");
	public static By football = By.id("ts_checkbox2");
	public static By hockey = By.id("ts_checkbox3");
	public static By submit = By.xpath("//input[@name='Submit1']");
	public static By pageheading = By.xpath("//strong[text() = 'Automation Testing Form']");
	
	public static void formFill(String fname, String lname, String add, String citizen, String gender, String interest){
		
		enterText(fName, fname);
		enterText(lName, lname);
		enterText(address, add);
		enterText(nationality, citizen);
		
		if(gender.equalsIgnoreCase("Male")) {
			click(male);
		}
		else if(gender.equalsIgnoreCase("Female")) {
			click(female);
		}
		else {
			System.out.println("Invalid input : - "+gender);
		}
		
		
		if(interest.equalsIgnoreCase("Cricket")) {
			click(cricket);
		}
		else if(interest.equalsIgnoreCase("Football")) {
			click(football);
		}
		else if(interest.equalsIgnoreCase("Hockey")) {
			click(hockey);
		}
		else {
			System.out.println("Invalid input : - "+interest);
		}
		
		click(submit);
		alertAction("ok");
	}
}





