package mavendemo1;
import org.testng.annotations.Test;


import wrappers.Opentapswrapper;



public class Iam extends Opentapswrapper {

	@Test
	public void createlead(){
		//System.out.println("from create lead");
		clickByLink("Create Lead");		
		enterById("createLeadForm_companyName", "cafefills");
		enterById("createLeadForm_firstName", "sruthi");
		enterById("createLeadForm_lastName", "bhagavatula");
		selectIndexById("createLeadForm_dataSourceId", "1");
		selectIndexById("createLeadForm_marketingCampaignId", "1");
		enterById("createLeadForm_primaryPhoneNumber","9012938504");
		enterById("createLeadForm_primaryEmail", "abcdef@gmail.com");
		clickByClassName("smallSubmit");
		getTextByXpath("(//span[@class='tabletext'])[3]");

	}

















}
