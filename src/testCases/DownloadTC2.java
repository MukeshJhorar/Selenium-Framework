package testCases;

import objectRepo.DownloadHomePageOR;
import objectRepo.DownloadTestingFormPageOR;
import utilities.DownloadBaseClass;

public class DownloadTC2 extends DownloadBaseClass{

	public static void main(String[] args) {
		
		openBrowser("Chrome");
		openUrl("https://seleniumautomationpractice.blogspot.com/");
		DownloadHomePageOR.clickTestingFormPage();
		DownloadTestingFormPageOR.formFill("Mukesh", "Kumar", "Sirsa", "America", "Male", "Hockey");
	}
}
