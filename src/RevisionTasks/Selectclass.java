package RevisionTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\java\\magesh\\SeleniumOct\\lib\\chromedriver1.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219806%7Ce%7Cfacebook%20registration%7C&placement=&creative=355887219806&keyword=facebook%20registration&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387563%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-299018536228%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA7qP9BRCLARIsABDaZziyAV6rmB09sUw9Z34wkHgEeBW0K_G9Gxa29x4OY7eibF2FPr2CJLcaAifSEALw_wcB");
	
	//WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	
	/*Task1- print all text options years
	WebElement years = driver.findElement(By.id("year"));
	Select slt=new Select(years);
	
	List<WebElement> options = slt.getOptions();
	for(WebElement et:options) {
		String print = et.getText();
		System.out.println(print);
	}
	
	//task 2 - print all attribute options - Days
	
	WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
	Select slt=new Select(days);
	List<WebElement> options = slt.getOptions();
	for(WebElement ed:options) {
		String attribute = ed.getAttribute("value");
	System.out.println(attribute);
	}*/
	
	/*task 3 & 4 print last 5 & first 5 months
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	Select slt=new Select(months);
	List<WebElement> options = slt.getOptions();
	
	for(int i=0;i<=4;i++) {
		WebElement print = options.get(i);
		String text = print.getText();
		System.out.println(text);
	
	for(int i=7;i<options.size();i++) {
		WebElement print = options.get(i);
		String text = print.getText();
		System.out.println(text)
}*/

	/*task 6 print alternate option month
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	Select slt=new Select(months);
	List<WebElement> options = slt.getOptions();
	
	for(int i=0;i<options.size();i=i+2) {
		WebElement print = options.get(i);
		String text = print.getText();
		System.out.println(text);
	}*/
	
	
	/*task 5 print middle option text
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	Select slt=new Select(months);
	List<WebElement> options = slt.getOptions();
	WebElement middle = options.get(6);
		String text = middle.getText();
		System.out.println(text);*/
	

	/*task 7 print all values without using Select class
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	
	String text = months.getText();
	System.out.println(text);*/
	
	/*task 8 print all year/month and dates
WebElement months = driver.findElement(By.xpath("//div[@id='birthday_wrapper']"));
	
	String text = months.getText();
	System.out.println(text);*/
	
	// task 5 print the middle option text- pending
	// task 9 check whether the months drop-down has duplicates- pending
	// task 10 check whether the years drop-down has duplicates-pending
	
	
	// task 11 print last value of month-where values changing dynamically
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	months.click();
	WebElement value = driver.findElement(By.xpath("(//option[@value='12'])[2]"));
	String text = value.getText();
	System.out.println(text);
	driver.quit();

	
	
	


	
}
}
		

	
	
	
	
	


