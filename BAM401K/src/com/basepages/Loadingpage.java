package com.basepages;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.test.util.FunctionUtil;
import com.test.util.Page;
import com.test.util.SystemUtil;
import com.test.util.TestCaseBase;
import com.test.util.Waiting;


public class Loadingpage extends Page{
	
	public static String TITLE = "BAM Retirement Solutions";
     Log log = LogFactory.getLog(this.getClass());
	//retrieve all the elements on this page
	//@FindBy(css="a.btn.btn-blue")
	@FindBy(xpath="//a[@class='btn btn-blue']")
	private static WebElement button;
	@FindBy(css="a.ico.delete.lightbox.prospectMarker")
	WebElement deletebutton1;
	@FindBy(xpath="//a[@class='close']")
	WebElement dismissbutton;
	@FindBy(xpath="//a[@class='close']")
	WebElement close;
	@FindBy(css="a#deleteProspectConformed")
	WebElement delete;
	//this will be very useful
	@FindBy(xpath="//p[contains(text(),'You are about to delete this prospect from the list. Would like to proceed with this action?')]")
	WebElement text;
	@FindBy(xpath="//p[contains(text(),'You are about to create your experience for this prospect. Would like to proceed with this action?')]")
	WebElement text1;
	
	@FindBy(xpath="//label[@for='keyword']")
	WebElement searchLable;
	@FindBy(css="input.search-prospect.k-input.text-active")
	WebElement searchbox;
	@FindBy(xpath="span[@data-id='2']")
	WebElement peiDui1;
	@FindBy(xpath="span[@data-id='3']")
	WebElement peiDui2;
	@FindBy(css="a.ico.create.lightbox.prospectMarker")
	WebElement createExperienceButton1;
	
	
	
	
	
	static Properties SOURCE = SystemUtil.loadPropertiesResources("login.properties");
	static String url = SOURCE.getProperty("url");

	
	public void clickButton(){
		TestCaseBase.threadDriver.get().navigate().to(url);
		System.out.println("navigation successfully!");
		TestCaseBase.threadDriver.get().manage().window().maximize();
		Waiting.implicitly(30);
		//Waiting.until(button);
		System.out.println("found button successfully!");
		System.out.println(button.isDisplayed());
		//((JavascriptExecutor) TestCaseBase.threadDriver.get()).executeScript("document.getElementById('searchByLocButton').click();");
		button.click();	
//		return new Prospectgeneralpage();
		
	}
	
	public void deleteProspect(){
		TestCaseBase.threadDriver.get().navigate().to(url);
		System.out.println("navigation successfully!");
		TestCaseBase.threadDriver.get().manage().window().maximize();
		Waiting.until(deletebutton1);
		deletebutton1.click();
		FunctionUtil.switchToNewWindow();
		log.info(delete.getText());
		log.info(text.getText());
		dismissbutton.click();		
		
		
	}
	
	public void createExperience(){
		createExperienceButton1.click();
		System.out.println("label of the button is "+createExperienceButton1.getText());
		FunctionUtil.switchToNewWindow();
		System.out.println(TestCaseBase.threadDriver.get().findElement(By.xpath("//p[contains(text(),'You are about to create your experience for this prospect. Would like to proceed with this action?')]")).getText());
		TestCaseBase.threadDriver.get().findElement(By.cssSelector("a.close")).click();
		
		
		
		
	}
	
	public boolean titleIs(String title) {
		log.info ("expected result="+title);
		log.info ("actual result="+TestCaseBase.threadDriver.get().getTitle());
		return (TestCaseBase.threadDriver.get().getTitle().equals(title));
	}
	public boolean titleContains(String title) {
		log.info("expected title to contain="+title);
		log.info("actual title="+getTitle());
		return (getTitle().contains(title));
	}
	
//	public boolean textContains(){
//		
//		log.info("expected result="+ peiDui1.getText() );
//		log.info("actual result="+ peiDui2.getText());
//		
//		
//	}
	
	
	public boolean textIs(String text){
		log.info("expected result=" + text);
		log.info("actual result="+searchLable.getText());
		return (searchLable.getText().equals(text));
	}
	
	public void searchFunction(){
		searchbox.sendKeys("prospect");
		Waiting.implicitly();
		
		
		
		
		
		
		
		
	}

}
