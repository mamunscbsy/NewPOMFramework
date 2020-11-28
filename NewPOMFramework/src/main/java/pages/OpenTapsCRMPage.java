package pages;

import wrapper.ProjectSpecificWrapper;

public class OpenTapsCRMPage extends ProjectSpecificWrapper{
	
	public OpenTapsCRMPage changeCompanyName(String ComName) {
		enterById("updateLeadForm_companyName", ComName);
		return this;
	}
	
 public ViewLeadPage clickUpdate() {
	 clickByXpath("//input[@value='Update']");
		return new ViewLeadPage();
	 
 }
}
