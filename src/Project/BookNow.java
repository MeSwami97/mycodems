package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookNow {
	
	public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
			
			driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
			
			Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
			
			
	}

}
