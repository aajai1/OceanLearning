package com.ajai.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShotProcess {
	
	
	
	
	public static void doScrnShot(WebDriver driver) {
		String link [] = driver.getCurrentUrl().split("/");
		String Title= link[link.length-1];
		TakesScreenshot scrn = (TakesScreenshot) driver;
		File file = scrn.getScreenshotAs(OutputType.FILE);
	
		try {
			Files.copy(file.toPath(),Path.of("D:\\Ajai\\Scrnshot files\\"+Title+".jpeg"),StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
		

}
