package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. we need to tell which browser are we launching
		// 1.where is that browser - location
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/NobleProg/Downloads/chromedriver_win32/chromedriver.exe");
		// 2. Need to create an object of WebDriver
		// ChromerDriver is a class & WebDriver is an Interface
		WebDriver driver = new ChromeDriver();
		// launch the URL
		driver.get("https://www.google.com");
	}

}
