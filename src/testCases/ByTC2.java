package testCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepo.HomePageOR;
import objectRepo.TestingFormPageOR;
import utilities.ByBaseClass;

public class ByTC2 extends ByBaseClass{

	@Test(priority = 0)
	public void preRun() {
		
		openBrowser("Chrome");
		openURL();
		HomePageOR.clickTestingFormPage();
	}
	
	
	@Test(priority = 1, dataProvider = "supplyData")
	public void formFilling(String fname, String lname, String add, String citizen, String gender, String interest) throws Exception {
		TestingFormPageOR.formFill(fname, lname, add, citizen, gender, interest);
	}
	
	@DataProvider
	public Object[][] supplyData() throws Exception{
		
		
		//File location to allow system to get the data from it
		FileInputStream fis = new FileInputStream(".\\src\\dataSets\\testData.xlsx");
		
		//To open the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		
		//Declare the sheet you want to use for reading the data
		Sheet sh = wb.getSheet("Sheet2");
		
		
		//Calculate the max no of rows and columns having data into it
		int numrows = sh.getLastRowNum()+1; //10
		int numcols = sh.getRow(0).getLastCellNum(); //5 + 1  = 6
		
		//Declaring each dimension of the two dimensional objects
		Object[][]  dataSet = new Object[numrows][numcols];

		for (int row = 0; row < numrows; row++) {
			for (int col = 0; col < numcols; col++) {
				
				dataSet[row][col] = sh.getRow(numrows).getCell(numcols).toString();
			}
		}
		
		return dataSet;
		
	}	
}











