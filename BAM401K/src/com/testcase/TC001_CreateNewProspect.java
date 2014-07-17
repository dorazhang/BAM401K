package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepages.Loadingpage;
import com.basepages.Prospectgeneralpage;
import com.test.util.TestCaseBase;


public class TC001_CreateNewProspect extends TestCaseBase{
	
	@Test(groups={"firefox"})
	public static void newProspect() throws Exception{
		
		Loadingpage loadingpage=PageFactory.initElements(driver, Loadingpage.class);
		//loadingpage.clickButton();
		loadingpage.deleteProspect();
		//System.out.println(loadingpage.textIs("SEARCH PROSPECTS:"));
		loadingpage.createExperience();
		
		
	//Prospectgeneralpage prospectgeneral = PageFactory.initElements(driver, Prospectgeneralpage.class);
	//prospectgeneral.createNew();
    //assert(prospectgeneral.titleIs(Prospectgeneralpage.TITLE));
	//prospectgeneral.selectContent();

		
		
		

	}

}
