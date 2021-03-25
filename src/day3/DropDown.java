package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For working with dropdown , we need to use Select class
		
		System.setProperty("webdriver.chrome.driver","C:/Users/NobleProg/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		
		Select obj=new Select(driver.findElement(By.id("select-demo")));
		obj.selectByIndex(1);
		obj.selectByValue("Friday");
		obj.selectByVisibleText("Thursday");
	}

}
