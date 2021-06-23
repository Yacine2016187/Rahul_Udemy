package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Yacine\\Desktop\\Eclipse2020 WorkSpace\\Udemy\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//drop down with select tag
		WebElement StaticDropD=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select obj= new Select(StaticDropD);
		
		obj.selectByValue("AED");
		System.out.println(obj.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		obj.selectByIndex(3);
		System.out.println(obj.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		obj.selectByVisibleText("INR");
		
	}

}
