package testCases;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class TC2 extends BaseClass {

	@Test
	public void execution() {
		
		openBrowser("Chrome");
		
		openAut();
		
		commonWait(10);
		
		click("//*[@class=\"blog-pager-older-link flat-button ripple\"]");
		
		click("//*[@class=\"blog-pager-older-link flat-button ripple\"]");
		
		click("//*[text() = 'Selenium WebElement Interactions']");
		
		enterText("//*[@name=\"firstname\"]", "Mukesh");
		
		back();
		
		back();
		
		back();
		
		shuttingDown();
	}
}
