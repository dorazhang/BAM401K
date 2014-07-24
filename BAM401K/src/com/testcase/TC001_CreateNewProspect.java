package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepages.Loadingpage;
import com.basepages.Prospectfirmpage;
import com.basepages.Prospectgeneralpage;
import com.basepages.Prospectpagedetailpage;
import com.test.util.TestCaseBase;


public class TC001_CreateNewProspect extends TestCaseBase{
	
	@Test(groups={"firefox"})
	public static void newProspect() throws Exception{
		
		Loadingpage loadingpage=PageFactory.initElements(driver, Loadingpage.class);
		loadingpage.deleteProspect();
//		System.out.println(loadingpage.textIs("SEARCH PROSPECTS:"));
//		loadingpage.createExperience();
//		loadingpage.searchFunction("Pros");
		loadingpage.clickButton();
		
		
	Prospectgeneralpage prospectgeneral = PageFactory.initElements(driver, Prospectgeneralpage.class);
//	prospectgeneral.createNew();
//	prospectgeneral.clickPlandetail();
    //assert(prospectgeneral.titleIs(Prospectgeneralpage.TITLE));
	//prospectgeneral.selectContent();

//	Prospectpagedetailpage prospectpagedetailpage = PageFactory.initElements(driver, Prospectpagedetailpage.class);
//	prospectpagedetailpage.settingDetail();
	prospectgeneral.clickFirm();
	Prospectfirmpage prospectfirmpage= PageFactory.initElements(driver, Prospectfirmpage.class);	
	prospectfirmpage.imageUpload();
		
	

	}

}
