package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper {
	
	public ViewLeadPage verifyFirstName(String firstName) {
		verifyTextByXpath("//input[@name='submitButton']", "firstName");
		return this;
	}

	 public ViewLeadPage verifyTitleOfPage(String title) {
		 verifyTitleOfPage(title);
		 return this;
		 
		 
	  }
	  public OpenTapsCRMPage clickEdit() {
			clickByLinkText("Edit");
			return new OpenTapsCRMPage();
	 }
		 public ViewLeadPage confirmChangeName(String firstName) {
		 verifyFirstName(firstName);
		 return this;
		}
	 public MyLeadsPage clickDelete() {
		 clickByXpath("//a[text()='Delete']");
		 return new MyLeadsPage();
	 }
	 
	  
	 public DuplicateLeadPage clickDuplicateLead() {
		 clickByXpath("//a[text()='Duplicate Lead']");
		 return new DuplicateLeadPage();
	 }
	 public ViewLeadPage confirmDupLeadCapturedLead(String Leadid) {
		 verifyTextContainsById("viewLead_companyName_sp", Leadid);
		 return this;
		 
	 } 
	 
	 public FindLeadsPage clickFindLeads() {
		 clickByXpath("//button[text()='Find Leads']");
		 return new FindLeadsPage();
	 }
}
