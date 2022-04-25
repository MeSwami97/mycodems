package Registration;

import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
	
	public void chrompage() {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		Registrationonpage page= new Registrationonpage(driver);
		
		page.driver.get("https://www.facebook.com/r.php");
		
		page.firstname("ms");
		
		page.lastname("sm");
		
		page.regemail("pm123@gmail.com");
		
		page.regpasswd("pass123@");
		
		page.sex();
		
		page.websubmit();
		
		
		
		
	}
	
	
	
	
	
	

}
