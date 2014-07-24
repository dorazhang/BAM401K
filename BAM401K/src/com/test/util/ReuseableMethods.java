package com.test.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebElement;

public class ReuseableMethods {
	
	public static Log log=LogFactory.getLog(ReuseableMethods.class);
	
	
	// the function of delete 
	//click no ,go back
	
	public static void deleteExperienceFunctionNo(WebElement element1,WebElement element2){
		element1.click();
		FunctionUtil.switchToNewWindow();
		element2.click();	
	}

	//click yes
	
	public static void deleteFunctionYes(WebElement element1,WebElement element2){
		element1.click();
		FunctionUtil.switchToNewWindow();
		element2.click();
		FunctionUtil.switchToNewWindow();
		
	}
	
	public static void convertToPlan(WebElement element1,WebElement element2,WebElement element3,WebElement element4){
		element1.click();
		FunctionUtil.switchToNewWindow();
		element2.click();
		//FunctionUtil.switchToNewWindow();
		
	}
	
	
	public boolean textIs(String text,WebElement element){
		log.info("expected result=" + text);
		log.info("actual result="+element.getText());
		return (element.getText().equals(text));
	}
	
}
