package com.basepages;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.test.util.FunctionUtil;
import com.test.util.SystemUtil;
import com.test.util.TestCaseBase;
import com.test.util.Waiting;

public class Prospectfirmpage {
	
	public static Log log= LogFactory.getLog(Prospectfirmpage.class);
	
	@FindBy(xpath="//*[@id='firm-logo']/section/p")
	WebElement direction;
	@FindBy(xpath="//*[@id='firm-logo']/section/div[1]/strong")
	WebElement filename;
	@FindBy(xpath="//*[@id='firm-logo']/section/div[3]/strong")
	WebElement size;
	@FindBy(xpath="//*[@id='firm-logo']/section/div[2]/strong")
	WebElement format;
	@FindBy(xpath="//*[@id='firm-logo']/section/div[4]/strong")
	WebElement dimension;
    @FindBy(css="#fileUploadButton")
	//@FindBy(css="#fileElem")
    WebElement uploadButton;
    @FindBy(css="#fileDeleteButton")
    WebElement deleteButton;
    
    
    //load the image url
    Properties PROPERTYSOURCE = SystemUtil.loadPropertiesResources("TC001.properties");
    String file= PROPERTYSOURCE.getProperty("image");
    
@FindBy(xpath="//*[@id='filePreview']")
WebElement filePreview;
@FindBy(xpath="//*[@id='fileNameSpan']")
WebElement fileName;
@FindBy(xpath="//*[@id='fileSizeSpan']")
WebElement fileSize;
@FindBy(xpath="//*[@id='fileFormatSpan']")
WebElement fileFormat;
@FindBy(xpath="//*[@id='fileWidthHeight']")
WebElement fileDimension;



public void imageUpload(){
	log.info("upload the image!");
	System.out.println("suggestion: "+direction.getText());
	log.info(uploadButton.getText());
	//uploadButton.click();
	//uploadButton.sendKeys(file);
	uploadButton.sendKeys("C:\\Users\\dora.zhang\\Desktop\\IMG_2010.JPG");

	
	Waiting.until(fileName);
	log.info("upload successfully!");
	log.info(fileName.getText());
	
	System.out.println("filename: "+fileName.getText()); 
//	System.out.println("size: "+fileSize.getText());
//	System.out.println("format: "+fileFormat.getText());
//	System.out.println("dimension: "+fileDimension.getText());	
	log.info("delete the image!");
	deleteButton.click();
//	System.out.println("filename: "+fileName.getText());
//	System.out.println("size: "+fileSize.getText());
//	System.out.println("format: "+fileFormat.getText());
//	System.out.println("dimension: "+fileDimension.getText());
}




}
