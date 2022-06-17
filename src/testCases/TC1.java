package testCases;

import utilities.BaseClass;

public class TC1 extends BaseClass{

	public static void main(String[] args) {
		
		openBrowser("Chrome");
		
		openAut();
		
		commonWait(10);

		click("//*[text() = 'Testing Form Page']");
		
		enterText("//*[@id=\"ts_first_name\"]", "Mukesh");
		
		shuttingDown();
	}
}
