package RevisionTasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitch {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\java\\magesh\\SeleniumOct\\lib\\chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
				
		/*WebElement userId = driver.findElement(By.xpath("//input[@id='fldLoginUserId']"));
		userId.sendKeys("sdfgh");*/
		
		WebElement signIn = driver.findElement(By.xpath("//input[@type='submit']"));
		signIn.click();
		Alert alt =driver.switchTo().alert();
		alt.accept();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
}
