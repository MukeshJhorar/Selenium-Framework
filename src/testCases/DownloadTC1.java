package testCases;

import objectRepo.DownloadHomePageOR;
import utilities.DownloadBaseClass;

public class DownloadTC1 extends DownloadBaseClass{

	public static void main(String[] args) {
		 openBrowser("Chrome");
		 openUrl("https://seleniumautomationpractice.blogspot.com/");
		 DownloadHomePageOR.clickTestingFormPage();
		 
	}
}
