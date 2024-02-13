import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElements(By.tagName("iframe")).size());   
  
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//ako želimo da nam prikaže linkove samo u footeru; limitirati ćemo scope drivera na footer driver, tako da definiramo varijablu..
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = driver.findElement(By.xpath("(//ul)[1]"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
	 
		//click on each link in column and check if the page is openning
		
		for (int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
	{
			
		String clickonlinkTab=	Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
	}//opens all tabs
		
			Set<String> abcdwindows = driver.getWindowHandles();
			Iterator<String> it=abcdwindows.iterator();

		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			
		}//iterate to all tabs and give the title
	
			
		
	}
	}
	

