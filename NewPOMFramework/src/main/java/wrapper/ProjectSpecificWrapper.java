package wrapper;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel1;



public class ProjectSpecificWrapper extends GenericWrapper{

	
	public String excelfile;
	
	//@Parameters({"url"})
	@BeforeMethod
	public void login() {
	invokeApp("http://leaftaps.com/opentaps");
	
	}

	@AfterMethod
	public void closeBrowser() {
quitBrowser();
	}
	
	@DataProvider
	public String[][] getData() throws IOException {		
		ReadExcel1 rl = new ReadExcel1();
		return rl.readExcel(excelfile);		
		}
}
