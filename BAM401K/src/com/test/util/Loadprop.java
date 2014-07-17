package com.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Loadprop {
	
	static public Properties prop = null;
	
	//public static void main(String[] args){
		public  static Properties readProp(String filename){
		
		   Loadprop loadprop = new Loadprop();
			InputStream in=loadprop.getClass().getClassLoader().getResourceAsStream(filename);
			//InputStream in = new FileInputStream(file);	
			 prop = new Properties();
		try{
			//File file = new File("SeleniumOnJira/src/testdata/"+filename);	
			prop.load(in);
		}catch(IOException e){
			e.printStackTrace();
			
		}
		System.out.println(prop.getProperty("login.username","none"));
		System.out.println(prop.getProperty("login.password","none"));
	  return prop;
		}

//}
//"testdata/testdata_JiraLogin.properties"

public static void main(String[] args){
	
	Properties PROPERTYSOURCE = new Properties();
	//Loadprop.readProp("testdata/testdata_JiraLogin.properties");
    PROPERTYSOURCE =Loadprop.readProp("testdata_JiraLogin.properties");
//    String url =PROPERTYSOURCE.getProperty("URL");
//	String username = PROPERTYSOURCE.getProperty("login.username");
//	String password = PROPERTYSOURCE.getProperty("login.password");
//    System.out.println(url);
//    System.out.println(username);
//    System.out.println(password);
}
}