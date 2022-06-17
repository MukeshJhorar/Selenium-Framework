package testCases;

import objectRepo.NewByHomePageOR;
import objectRepo.NewByTestingFormPageOR;
import utilities.NewByBaseClass;

public class NewByTC2 extends NewByBaseClass{

	public static void main(String[] args) {
		
		openBrowser("Chrome");
		openURL();
		NewByHomePageOR.clickTestingFormpage();
		NewByTestingFormPageOR.formFill("Mukesh", "Jhorar", "Sirsa", "India", "Male", "Cricket");
	}
}
