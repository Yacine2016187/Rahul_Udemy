package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpadateDropDown {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Yacine\\Desktop\\Eclipse2020 WorkSpace\\Udemy\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement Passengers=driver.findElement(By.id("divpaxinfo"));
		Passengers.click();
		Thread.sleep(2000L);
		
		
		int i=1;
		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		/*
		for(int i=1;i<5;i++)
		{
			
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		*/
	}

	
}
