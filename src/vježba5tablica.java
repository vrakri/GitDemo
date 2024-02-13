import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class vježba5tablica {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		
		WebElement table=driver.findElement(By.cssSelector(".table-display"));

		System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println(table.findElements(By.tagName("th")).size());
		
		System.out.println(table.findElements(By.tagName("th")).size());
		
		List<WebElement>values = driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(values.get(0).getText());
		
		System.out.println(values.get(1).getText());
		
		System.out.println(values.get(2).getText());
		
	
		
		
		
		
	}
	
	}

