package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Yacine\\Desktop\\Eclipse2020 WorkSpace\\Udemy\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[@text='Chennai (MAA)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@text='Delhi (DEL)'])[2]")).click();
	}

}
