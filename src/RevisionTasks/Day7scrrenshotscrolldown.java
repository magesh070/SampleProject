package RevisionTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7scrrenshotscrolldown {
	public static void main(String[] args) throws IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\magesh\\SeleniumOct\\lib\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("iphone 11");
		
		Robot in=new Robot();
		
		in.keyPress(KeyEvent.VK_ENTER);
		in.keyRelease(KeyEvent.VK_ENTER);
		/*WebElement address = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", address);*/
		
		
		/*WebElement inter = driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[5]"));
		js.executeScript("arguments[0].scrollIntoView(true)", inter);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\SOFI\\Desktop\\magesh\\materials\\sel-ques.png");
		FileUtils.copyFile(src, des);
		
		
		
		
		/*WebElement scrolldown = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrolldown );
		System.out.println(scrolldown.getText());*/
	}

}
