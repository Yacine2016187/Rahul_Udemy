package RahulShetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Yacine\\Desktop\\Eclipse2020 WorkSpace\\Udemy\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement RoundTrip=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		RoundTrip.click();
		
		
		WebElement Depart=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		Depart.click();

	}

}
