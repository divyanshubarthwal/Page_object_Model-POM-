package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.rediffloginpage;



@Test
public class Loginapplication {
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rediffloginpage rd= new rediffloginpage(driver);
		rd.Email().sendKeys("divyanshubarthwal");
		Thread.sleep(1000);
		rd.Passkey().sendKeys("Kgf@2021");
		Thread.sleep(1000);
		rd.Submit().click();
		rd.Home().click();
		
}
	
	

}
