package pages;

import wrapper.ProjectSpecificWrapper;

public class DuplicateLeadPage extends ProjectSpecificWrapper {
	
	public DuplicateLeadPage verifyTitleAsDuplicateLead(String title) {
		verifyTitle(title);
		return this;
	}

	public ViewLeadPage clickCreateLeadBtn() {
		clickByXpath("//input[@value='Create Lead']");
		return new ViewLeadPage();
	}
}
