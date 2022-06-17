package objectRepo;

import org.openqa.selenium.By;

import utilities.DownloadBaseClass;


public class DownloadTestingFormPageOR extends DownloadBaseClass{

	public static By fName = By.name("ts_first_name");
	public static By lName = By.name("ts_last_name");
	public static By add =By.name("ts_address");
	public static By nationality = By.xpath("//*[@id=\"ts_country\"]");
	public static By male = By.xpath("//*[@value='male']");
	public static By female = By.xpath("//*[@value='female']");
	public static By cricket = By.id("ts_checkbox1");
	public static By football = By.id("ts_checkbox2");
	public static By hockey = By.id("ts_checkbox3");
	public static By submit = By.name("Submit1");
	
	
	public static void formFill(String fname, String lname, String address, String country, String gender, String interest) {
		
		enterTxt(fName, fname);
		enterTxt(lName, lname);
		enterTxt(add, address);
		select(nationality, country);
		if (gender.equalsIgnoreCase("male")) {
			click(male);
		} else if(gender.equalsIgnoreCase("female")) {
			click(female);			
		}else {	
			System.out.println("Invalid Input" + gender);
		}
		
		if (interest.equalsIgnoreCase("Cricket")) {
			click(cricket);
		} else if(interest.equalsIgnoreCase("Football")) {
			click(football);			
		} else if (interest.equalsIgnoreCase("Hockey")){
			click(hockey);
		} else {	
			System.out.println("Invalid Input" + interest);
		}
		click(submit);
		alertAction("ok");
	}
	
}









