package RevisionTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
   
    public static WebDriver launchChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\java\\magesh\\SeleniumOct\\lib\\chromedriver1.exe");
        driver = new ChromeDriver();
        return driver;
	}
    public static WebDriver launchfirefoxBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\java\\magesh\\SeleniumOct\\lib\\geckodriver.exe");
        return driver = new FirefoxDriver();
	}
    public static void launchUrl(String url) {
	    driver.get(url);
		}
    public static void maximizeWindow() {
		driver.manage().window().maximize();
			}
	public static String getTitle() {
		String title = driver.getTitle();	
		System.out.println(title);
		return title;
	}
	public static String getPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	public static void type(WebElement element,String string_value) {
		element.sendKeys(string_value);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	//get-text
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	//getAttribute
	public static void getAttributrValue(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	public static  void quitBrowser() {
		driver.quit();
	}
	
	public static  void closeBrowser() {
		driver.close();
	}
}
