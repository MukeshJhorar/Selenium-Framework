package testCases;

import objectRepo.HomePageOR;
import objectRepo.TestingFormPageOR;
import utilities.ByBaseClass;

public class ByTC1 extends ByBaseClass{

	public static void main(String[] args) throws Exception {
		
		openBrowser("Chrome");
		
		openURL();
		
		HomePageOR.clickTestingFormPage();
		TestingFormPageOR.formFill("Mukesh", "Jhorar", "Sirsa", "Indian", "Male", "Cricket");
	}
}
