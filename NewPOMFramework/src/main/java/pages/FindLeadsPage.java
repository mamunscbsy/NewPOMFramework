package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsPage extends ProjectSpecificWrapper{
			
	public FindLeadsPage enterFirstName(String Fname) {
		enterByXpath("(//input[@name='firstName'])[3]", Fname);
		return this;
	}
	public FindLeadsPage clickFindLeadsBtn() {
		clickByXpath("//button[text()='Find Leads']");
		return this; 
	}
	
	public ViewLeadPage clickFstResLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return new ViewLeadPage();
	}
		
	/*public void confirmChangeName() {
		
	}*/
	
	 public FindLeadsPage clickOnPhone() {
		 clickByXpath("//span[text()='Phone']");
		 return this;
	 }
	 public FindLeadsPage enterPhoneNumber(String PhNo) {
		 enterByXpath("(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input)[13]", PhNo);
		 return this;
	 }
	 public FindLeadsPage captureLeadIdOfFstResLead() {
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		 return this;
	 }
	 public ViewLeadPage clickFstResLead2() {
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		 return new ViewLeadPage();
	 }
	 public FindLeadsPage enterCapturedLeadId(String capId) {
		 enterByXpath("(//div[@class='x-form-element']/input)[13]", capId);
		 return this;
	}
	 
	 public void verifyErrorMsg() {
		
		 
	 }
	 public FindLeadsPage clickOnEmail() {
		 clickByXpath("//span[text()='Email']");
		 return this;
	 }
	 public FindLeadsPage enterEmail(String eEmail) {
		 enterByXpath("(//div[@class='x-form-element']/input)[17]", eEmail);
		 return this;
	 }
	 public FindLeadsPage captureNameofFstResLead() {
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		 return this;
	 }
	 public ViewLeadPage clickFstResLead3() {
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		 return new ViewLeadPage();
	 }
		 
	public FindLeadsPage enterFormLeadId(String enterFormLId) {
		enterByXpath("(//div[@class='x-form-element']/input)[13]", enterFormLId);
		return this;
	} 
	 
}