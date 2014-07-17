package com.basepages;

import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.test.util.Page;
import com.test.util.SystemUtil;

public class Prospectgeneralpage extends Page {
	
	public static String TITLE = "BAM Retirement Solutions";
	static Log log = LogFactory.getLog(Prospectgeneralpage.class);
	//retrieve all the elements on this page
	@FindBy(css="a.btn btn-blue")
	private static WebElement button;
	@FindBy(id="plan")
	private static WebElement planName;
	@FindBy(css="select#advisor")
	private static WebElement advisor;	
	@FindBy(css="select#state")
	private static WebElement state;
	@FindBy(id="proposed")
	private static WebElement proposedRecordKeeper;
	@FindBy(id="contact")
	private static WebElement contactbox;
	@FindBy(id="address1")
	private static WebElement address1box;
	@FindBy(id="address2")
	private static WebElement address2box;
	@FindBy(id="city")
	private static WebElement citybox;
	@FindBy(id="zip")
	private static WebElement zipbox;
	@FindBy(id="website")
	private static WebElement websitebox;
	@FindBy(id="fax")
	private static WebElement faxbox;
	@FindBy(id="phone")
	private static WebElement phonebox;
	
	//retrieve test data from property file
	
		static Properties SOURCE = SystemUtil.loadPropertiesResources("TC001.properties");
		static String plan = SOURCE.getProperty("plan");
		static String recordKeeper = SOURCE.getProperty("recordKeeper");
		static String contact = SOURCE.getProperty("contact");
		static String address1 = SOURCE.getProperty("address1");
		static String address2 = SOURCE.getProperty("address2");
		static String city = SOURCE.getProperty("city");
		static String zip = SOURCE.getProperty("zip");
		static String website = SOURCE.getProperty("website");
		static String fax = SOURCE.getProperty("fax");
		static String phone = SOURCE.getProperty("phone");
		
	
	
	public  void createNew(){	
		
		planName.sendKeys(plan);
		Select selectAdvisor = new Select(advisor);
		selectAdvisor.selectByVisibleText("Curtis Connors");
		Select selectState = new Select(state);
		selectState.selectByValue("9");		
		proposedRecordKeeper.sendKeys(recordKeeper);
		contactbox.sendKeys(contact);
		address1box.sendKeys(address1);
		address2box.sendKeys(address2);
		citybox.sendKeys(city);
		zipbox.sendKeys(zip);
		websitebox.sendKeys(website);
		faxbox.sendKeys(fax);
		phonebox.sendKeys(phone);
		log.info("data has been input!");		
		
	}
	
	public void selectContent(){
		
		List<WebElement> allOptions= state.findElements(By.tagName("option"));
		
		for(WebElement option : allOptions){
			System.out.println("this option's text is "+option.getText());
			option.click();
		}
		
		
		
		
	}



}
