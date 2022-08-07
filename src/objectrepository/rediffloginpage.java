package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffloginpage {

	
		
		WebDriver driver;
		public rediffloginpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		
		By username=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[2]/input");
		By password=By.name("passwd");
		By go=By.name("proceed");
		By home = By.linkText("Home");

		By Search = By.xpath("//input[@id='srchword']");

		By Searchtext= By.id("srchinputcopy");

		By Searchbtn = By.xpath("//input[@value='Search']");

		public WebElement Email(){

		   return driver.findElement(username);

		}

		public WebElement Passkey()

		{

		    return driver.findElement(password);

		}

		public WebElement Submit(){

		return driver.findElement(go);

		}

		public WebElement Home(){

		return driver.findElement(home);

		}

		public WebElement Search() {

		return driver.findElement(Search);

		}

		public WebElement Searchtext()

		{

		return driver.findElement(Searchtext);

		}

		public WebElement Searchbtn()

		{

		return driver.findElement(Searchbtn);

		}

		
	
}
