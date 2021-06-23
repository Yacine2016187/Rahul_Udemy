package RahulShetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yacine\\Desktop\\Eclipse2020 WorkSpace\\Udemy\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Create=driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		Create.click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement FName=driver.findElement(By.xpath("//*[@placeholder='First name']"));
		FName.sendKeys("Boun");
		
		WebElement LName=driver.findElement(By.name("lastname"));
		LName.sendKeys("Amir");
		
		WebElement Mobile=driver.findElement(By.name("reg_email__"));
		Mobile.sendKeys("5127892536");
		
		WebElement Passe=driver.findElement(By.xpath("//*[@autocomplete='new-password']"));
		Passe.sendKeys("Amir2020");
		
		WebElement Month=driver.findElement(By.name("birthday_month"));
		Select objSelect1 = new Select(Month);
		objSelect1.selectByIndex(2);
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select objSelect2 = new Select(day);
		objSelect2.selectByIndex(10);
		
		WebElement Year=driver.findElement(By.name("birthday_year"));
		Select objSelect3 = new Select(Year);
		objSelect3.selectByValue("1990");
		
		WebElement Gender=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Gender.click();
		WebElement SignUp=driver.findElement(By.name("websubmit"));
		SignUp.click();
	}

}
