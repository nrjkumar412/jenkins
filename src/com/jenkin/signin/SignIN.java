package com.jenkin.signin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.jenkin.base.Base;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SignIN extends Base{

	@Test
	public void multi_signin() {
		try {
			Base.open("firefox");
			//driver=new FirefoxDriver();
			test_Signin();
			Assert.assertTrue(true);

			System.out.println("Firefox Complete");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			try {
			Base.open("chrome");
			test_Signin();
			Assert.assertTrue(true);
			
			System.out.println("Chrome Complete");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		try {
			Base.open("safari");
			test_Signin();
			Assert.assertTrue(true);
			
			System.out.println("Safari Complete");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void test_Signin() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://amber.infeedo.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/md-content/div[1]/md-toolbar/div/button[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='input_3']")).clear();
		driver.findElement(By.xpath(".//*[@id='input_3']")).sendKeys("varunpuri@infeedo.com");
		driver.findElement(By.xpath(".//*[@id='input_4']")).clear();
		driver.findElement(By.xpath(".//*[@id='input_4']")).sendKeys("romi1234");
		driver.findElement(By.id("login_user")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}