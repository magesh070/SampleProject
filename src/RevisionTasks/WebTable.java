package RevisionTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

public class WebTable extends Base{
	public static void main(String[] args) throws InterruptedException {
			
	launchChromeBrowser();
	launchUrl("https://www.facebook.com/");
	maximizeWindow();
	getTitle();
	getPageUrl();
	WebElement username = driver.findElement(By.id("email"));
	type(username, "greens");
	getAttributrValue(username);
	Navigation navigate = driver.navigate();
	navigate.refresh();
	Thread.sleep(2000);
	navigate.to("https://www.javatpoint.com/selenium-webdriver-navigation-commands");
	Thread.sleep(2000);
	navigate.back();
	Thread.sleep(4000);
	quitBrowser();
	
	
	}

}
