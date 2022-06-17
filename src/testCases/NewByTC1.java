package testCases;

import objectRepo.NewByHomePageOR;
import utilities.NewByBaseClass;

public class NewByTC1 extends NewByBaseClass{

	public static void main(String[] args) {

		openBrowser("Chrome");
		openURL();
		NewByHomePageOR.clickTestingFormpage();
		shuttingDown();
	}
}
