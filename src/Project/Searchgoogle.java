package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchgoogle {
	
	public static void main(String[] args) throws Exception  {
		
	       System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.name("q")).sendKeys("selenium");
			
			Thread.sleep(5000);
			
	//driver.findElement(By.xpath("//*[@jsname='bw4e9b']//li[3]")).click();
			
	List<WebElement> sel = driver.findElements(By.xpath("//*[@jsname='bw4e9b']"));
	
	int z = sel.size();
	
	for(int i=0;i<=z;i++)
		{
		String n = sel.get(i).getText();
		System.out.println(n);
		
		if(n.equals("selenium webdriver"))
		
		{
			Thread.sleep(2000);
			sel.get(i).click();
		}
	
	}
	}
	

			
}



//*[@jsname='bw4e9b']//span[contains(text(),'selenium']