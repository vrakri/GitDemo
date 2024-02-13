import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vjezba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www-dc1.stage.ifortuna.cz/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("cookie-consent-button-settings")).click();
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Přijmout')]")));
		Thread.sleep(1000);
		
	
		driver.findElement(By.xpath("//button[contains(text(),'Přijmout')]")).click();			
	
	}

	
	}
	


