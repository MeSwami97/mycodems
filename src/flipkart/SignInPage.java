package flipkart;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignInPage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//login
		
		//driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9370700244");
		
		//WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		
		//password.sendKeys("mswami143");
		
		//driver.findElement(By.xpath("//div//*[@class='_2KpZ6l _2HKlqd _3NgS1a']")).click();
		
		
		//size
		//List<WebElement> link = driver.findElements(By.xpath("//div[@class='_2WErco row']//a"));
		
		//System.out.println(link.size());
		
		WebElement back = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
		back.click();
		
		//driver.findElement(By.xpath("//*[@title='Search for products, brands and more']")).sendKeys("Mi Mobile");
		
		
		
	  WebElement ele = driver.findElement(By.xpath("//*[@class='_2I9KP_'][1]"));
	  Actions act= new Actions(driver);
	  act.moveToElement(ele).perform();
	}

}
