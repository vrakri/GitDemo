import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.path2usa.com/travel-companion/");
		//Actions a=new Actions(driver);
		//WebElement move=driver.findElement(By.cssSelector("#form-field-travel_comp_date"));
		
		//WebElement element = driver.findElement(By("element_path"));

	    //Actions actions = new Actions(driver);

		//actions.moveToElement(element).click().perform();
		//August 23
		//WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(10));
        //w.until(ExpectedConditions.elementToBeClickable(By.id("form-field-travel_comp_date")));
		//driver.findElement(By.id("form-field-travel_comp_date")).click();	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();
		Thread.sleep(8000);
		//driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		
		//List<WebElement> dates =driver.findElements(By.cssSelector(".flatpickr-day "));
		
		//int count = driver.findElements(By.cssSelector(".flatpickr-day ")).size();
		
		//for (int i=0; i<count;i++);
		
		//   	{
		//      int i = 0;
		       
		   //    String text = driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
		   //    if(text.equalsIgnoreCase("23"))
		    //  {
		   	 //  driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click(); 
		    //	   break;
		   //    }
		  // 	}   
		       
		  // 	}
	}}
