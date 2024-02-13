import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class javaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
	List<WebElement>values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(3)"));
	
	int sum=0;
	
		for (int i=0;i<values.size();i++)
			
		{ 
			sum = sum + Integer.parseInt(values.get(i).getText());
			
		}
	        System.out.println(sum);
	
	        driver.findElement(By.cssSelector(".totalAmount")).getText();
	        // driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim(); //kad debugiramo, vidimo da moramo iz teksta izvojiti samo broj; 
	                                                                                         //trim je metoda kojom se rješavamo razmaka
	        int totalsum = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	
	        Assert.assertEquals(sum, totalsum);
	}
	
	

}
