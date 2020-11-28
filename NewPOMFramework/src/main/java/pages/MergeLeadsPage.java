package pages;

import wrapper.ProjectSpecificWrapper;

public class MergeLeadsPage extends ProjectSpecificWrapper{
	
	public FindLeadsWindowPage clickIconNearFormLead() {
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		return new FindLeadsWindowPage();
	}
	public FindLeadsWindowPage ClickIconNearToLead() {
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new FindLeadsWindowPage();
	}
	public ViewLeadPage clickMerge() {
		clickByXpath("//a[text()='Merge']");
		acceptAlert();
		return new ViewLeadPage();
	}
	
}
