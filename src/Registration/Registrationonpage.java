package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrationonpage {
	
	WebDriver driver;
	
	By firstname=By.name("firstname");
	
	By lastname=By.name("lastname");
	
	By regemail=By.name("reg_email__");
	
	By regpasswd=By.name("reg_passwd__");
	
	By sex=By.name("sex");
	
	By websubmit=By.name("websubmit");
	
	Registrationonpage(WebDriver web){
		
		//this.driver=driver;
		
		driver=web;
	}
	
	public void firstname(String fname)      {driver.findElement(firstname).sendKeys(fname);}
	
	public void lastname(String lname)       { driver.findElement(lastname).sendKeys(lname); }
	
	public void regemail(String mail)        { driver.findElement(regemail).sendKeys(mail); }
	
	public void regpasswd(String pass)       { driver.findElement(regpasswd).sendKeys(pass); }
	
    public void websubmit()    {  driver.findElement(sex).click();}
	
    public void sex()             { driver.findElement(websubmit).click(); }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

