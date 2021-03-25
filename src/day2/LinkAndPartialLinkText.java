package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/NobleProg/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		
		
		
		driver.findElement(By.linkText("Body Fat")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Ideal Weight")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Pregnancy")).click();
		Thread.sleep(4000);
	}

}
