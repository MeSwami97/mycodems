package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {
	
	public static void main(String[] args) throws InterruptedException  {
		
	  /*  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
			
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@class='ajxPlaceCs ui-autocomplete-input']")).sendKeys("latur");
		

		driver.findElement(By.xpath("//*[@class='ajxPlaceCs']")).click();
		
	    Thread.sleep(2000);
		
		String popup = driver.switchTo().alert().getText();
		
		System.out.println(popup);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@class='ajxPlaceCs']")).sendKeys("HIMCHALBHAVANDILHI");
	
	    Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();          */
		
		
		//WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']"));
		
		//month.sendKeys("march");
		
		//WebElement date = driver.findElement(By.xpath("//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi-2 ui-datepicker-multi']"));
		
		//date.sendKeys("12");
		
		
		
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@class='autoFill homeSearch']//li[@data-id='575']")).sendKeys("latur");
		
		Thread.sleep(5000);
		
		Actions act= new Actions(driver);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		

}
}