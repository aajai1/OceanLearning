package com.ajai.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ajai.utils.Driverorigin;
import com.ajai.utils.ScreenShotProcess;

public class WebbDriver {
	public static void main(String[] args) {
		WebDriver driver = Driverorigin.driverOrigin();
		driver.get("https://oceanacademy.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Courses")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Online Courses")).click();
		ScreenShotProcess.doScrnShot(driver);
		
		
	}

}
