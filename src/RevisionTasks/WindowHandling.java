package RevisionTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\java\\\\magesh\\\\SeleniumOct\\\\lib\\\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement sitePopup = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		sitePopup.click();
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("iphone 12",Keys.ENTER);
		
		WebElement phone = driver.findElement(By.xpath("(//span[text()='New Apple iPhone 12 (64GB, Black) [Locked] + Carrier Subscription'])[1]"));
		Actions act=new Actions(driver);
		Robot rbt =new Robot();
	    act.contextClick(phone).perform();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_TAB);
		
		
		WebElement Info = driver.findElement(By.xpath("//span[text(),='Temporarily out of stock.']"));
		driver.getWindowHandle();
		String infotxt = Info.getText();
		System.out.println(infotxt);
		
		
		
	}
}
