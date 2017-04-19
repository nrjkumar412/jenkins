package com.jenkin.base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	public static WebDriver driver=null;
public static void open(String browser){
	switch (browser) {
	
	
	
		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "chrome":
			
			final File Browser_file = new File(
					"/Users/neerajkumar/Documents/Eclipse_workspace_Amber_Web/infeedo-amber/jars/chromedriver");
			System.setProperty("webdriver.chrome.driver", Browser_file.getAbsolutePath());
			driver = new ChromeDriver();
			break;

		case "safari":
			System.setProperty("webdriver.safari.noinstall", "true");
			driver = new SafariDriver();
			break;
		
	
	
	/*	case "opera":
		final File Browser_file_opera = new File("/Users/neerajkumar/Documents/Eclipse_workspace_Amber_Web/infeedo-amber/jars/operadriver");
			System.setProperty("webdriver.opera.driver",  Browser_file_opera.getAbsolutePath());
			
			
			String operaChromiumDriver = "/Users/neerajkumar/Documents/Eclipse_workspace_Amber_Web/infeedo-amber/jars/operadriver";
			String operaBrowserLocation = "/Applications/Opera Neon.app/Contents/MacOS/Opera Neon";

			System.setProperty("webdriver.opera.driver", operaChromiumDriver);

			ChromeOptions options = new ChromeOptions();
			options.setBinary(operaBrowserLocation);        

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			OperaDriver operabrowser = new OperaDriver(capabilities);
			
			//driver= operbrowser;
			
			  break;*/
			  
	
		

	}
}
}
