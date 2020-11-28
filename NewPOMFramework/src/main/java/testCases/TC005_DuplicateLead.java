package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC005_DuplicateLead extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		excelfile = "TC005_DuplicateLead";
	}

	@Test(dataProvider = "getData")
	public void duplicateLeade(String uName,String pwd,String Email, String title, String firstName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeads()
		.clickOnEmail()
		.enterEmail(Email)
		.clickFindLeadsBtn()
		.captureNameofFstResLead()
		.clickFstResLead3()
		.clickDuplicateLead()
		
		.verifyTitleAsDuplicateLead(title)
		
		.clickCreateLeadBtn()
		
		.verifyFirstName(firstName);
		
		
		
	}

}
