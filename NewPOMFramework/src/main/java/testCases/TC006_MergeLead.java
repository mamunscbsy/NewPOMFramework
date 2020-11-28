package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC006_MergeLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void setData() {
		excelfile = "TC006_MergeLead";
	}
	
	@Test(dataProvider= "getData")
	public void mergeLead(String uName, String pwd,String entLeadId, String entLeadId1,String enterFormLId) {
		
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickMergeLeads()
		.clickIconNearFormLead()
		.enterLeadId(entLeadId)
		.clickFindLeadBtn()
		.clickFstResLead()
		.ClickIconNearToLead()
		.enterLeadId(entLeadId1)
		.clickFindLeadBtn()
		.clickFstResLead()
		.clickMerge()
		.clickFindLeads()
		.enterFormLeadId(enterFormLId)
		.clickFindLeadsBtn()
		.verifyErrorMsg();
		
		
		
		
	}
	

}
