package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Selenium Methods
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/NobleProg/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("TJ");
		driver.findElement(By.xpath("//*[@name='q']")).clear();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
	
		
		
		
	}

}
