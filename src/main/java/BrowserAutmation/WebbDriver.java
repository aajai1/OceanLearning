package BrowserAutmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebbDriver {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
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
		
		
	}

}
