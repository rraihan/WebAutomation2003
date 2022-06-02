package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/accountchooser/signinchooser?flowName=GlifWebSignIn&flowEntry=AccountChooser");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("dialraihan@gmail.com");
		
	
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button")).click();
		
	}




	}




