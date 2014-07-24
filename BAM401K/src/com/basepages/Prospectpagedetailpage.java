package com.basepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.test.util.FunctionUtil;
import com.test.util.Page;
import com.test.util.ReuseableMethods;
import com.test.util.TestCaseBase;

public class Prospectpagedetailpage extends ReuseableMethods{
	
	@FindBy(xpath="//label[@for='proposedModel']")
	WebElement modelable;
	@FindBy(xpath="//label[contains(text(),'TOTAL PARTICIPANTS:')]")
	WebElement label2;
	@FindBy(xpath="//label[contains(text(),'ACTIVE PARTICIPANTS:')]")
	WebElement label3;
	@FindBy(xpath="//label[contains(text(),'TOTAL PLAN ASSETS:')]")
	WebElement label4;
	@FindBy(xpath="//label[contains(text(),'ASSETS AS OF:')]")
	WebElement label5;
	@FindBy(xpath="//select[@id='proposedModel']")
	WebElement modelSelect;
	@FindBy(xpath="//input[@class='k-formatted-value k-input']")
	WebElement total;
	@FindBy(xpath="//input[@class='k-formatted-value k-input']")
	WebElement active;
	@FindBy(xpath="//input[@class='k-formatted-value k-input']")
	WebElement assets;
	@FindBy(css="span.k-icon.k-i-calendar")
	WebElement calenderSelect;
	@FindBy(xpath="//a[@data-value='2014/6/21']")
	WebElement dataSelected;
	@FindBy(xpath="//input[@id='assetsAsOf']")
	WebElement calenderbox;
	
	public void settingDetail(){
		Prospectpagedetailpage page= new Prospectpagedetailpage();
		assert (page.textIs("*PROPOSED MODEL:",modelable));
		log.info("label is correct!");
		Select select = new Select(modelSelect);
		select.selectByVisibleText("Market");
		total.sendKeys("60");
		active.sendKeys("50");
		assets.sendKeys("130000");
		log.info("before calender");
		calenderSelect.click();
		FunctionUtil.switchToNewWindow();
		Actions action= new Actions(TestCaseBase.threadDriver.get());
		action.click(dataSelected).perform();
		log.info("the data of calender is "+calenderbox.getText());
		
		
		
		
		
	}
	
	

	
	
	

	
	
	
	
	
	

}
