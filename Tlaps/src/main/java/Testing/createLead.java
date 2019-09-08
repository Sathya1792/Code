package Testing;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class createLead {
	
	public class CreateLead extends baseclass {
		@BeforeClass
		public void setdata()
		{
		filename="CREATELEAD";
		
		}
		@Test(dataProvider="customdata")
		public void runCreateLead(String cname, String fname, String lname) {
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys(cname);
			driver.findElementById("createLeadForm_firstName").sendKeys(fname);
			driver.findElementById("createLeadForm_lastName").sendKeys(lname);
			driver.findElementByName("submitButton").click();
	}
		
}
}

