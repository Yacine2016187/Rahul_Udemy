package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Yacine\\Desktop\\Eclipse2020 WorkSpace\\Udemy\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='inputs ui-autocomplete-input']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> Options = driver.findElements(By.cssSelector("li[class=ui-menu-item]"));
		for(WebElement option:Options)
		
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
	}
		}
		
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		
		//count the number of checkboxs ----> find 
		
		List <WebElement> nmbrCheckBox=driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(nmbrCheckBox.size());
		Assert.assertEquals(nmbrCheckBox.size(), 6);
		
		System.out.println("Yes");
		
		
	}

}
