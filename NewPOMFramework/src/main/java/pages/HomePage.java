package pages;

import wrapper.ProjectSpecificWrapper;

public class HomePage extends ProjectSpecificWrapper {
	
	public LoginPage clickLogOut() {
		clickByClassName("decorativeSubmit");
		return new LoginPage();
		
	}

	public MyHomePage clickCRMSFA() {
		clickByLinkText("CRM/SFA");
		return new MyHomePage();
	}
}
