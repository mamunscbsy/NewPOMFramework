Feature: Automate Leaftaps Application 

@smoke
Scenario Outline: TC001_Login and Logout 

	Given Launch chrome browser and load url 
	And enter username as <username>
	And enter password as <password>
	When click the login button 
	Then its navigated Homepage 
	And  click the logout button
	And close browser
	
Examples: 
	|username|password|
	|DemoSalesManager|crmsfa|
	|DemoCSR|crmsfa|

@functional
Scenario:  TC002_Login and Logout for failure

Given Launch chrome browser and load url 
	And enter username as ssssss 
	And enter password as crmsfa 
	When click the login button 
	Then its navigate same Page
	But verify error msg
	And close browser

@smoke	 
Scenario: TC003_CreateLead

Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	And click leads link
	When click createLead
	
	And enter the company as TCS
	And enter the first name as Gopi
	And enter the last name as J
	And choose source as Website
	And click the create lead button
	Then its navigated ViewLeadPage 
	And verify the firstname
	And close browser
	
Scenario: TC004_EditLead
	Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	And click leads link
	When click Find Leads
	
	And enter firstname
	And click Find Leads button
	And click first resulting lead
	Then navigated ViewLeadPage
	And verify title of the page
	And click on Edit
	Then navigated Edit Lead page
	And change the company name
	And click update
	And confirm changed name appears
	And close browser
	
Scenario: TC005_DeleteLead
Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	And click leads link
	When click Find Leads
	
	And click on phone
	And enter phone number 
	And click find leads button
	And capture lead ID of first resulting lead
	And click first resulting lead
	And click Delete
	Then navigated MyLeadsPage
	And click Find Leads
	And enter captured lead ID
	
	And verify error message
	And close browser
