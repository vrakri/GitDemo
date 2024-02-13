import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.api.internal.Utils;

public class NewWindow126 {

	private static final CopyOption REPLACE_EXISTING = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");	
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);

		//Switching window
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);

		
		Set<String> handles = driver.getWindowHandles(); // (parentId, childId)
		Iterator <String> it= handles.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.get("https://courses.rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("div[class*='course-listing-title']")).get(1).getText();
		
		driver.switchTo().window(parentId);
		
		//driver.findElement(By.cssSelector("input[name='name']")).sendKeys(courseName);
	    //  driver.quit();	
	    //------------------------------------------------
	    WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
	    
	    name.sendKeys(courseName);
	  
	    
	    //Taking screenshot
	    
	   // File screenshot = name.getScreenshotAs(OutputType.FILE);//ovaj dio ne radi
	    
	   // FileUtils.copyFile(screenshot, new File("logo.png")); //ovaj dio ne radi
	    
	   // ili po knjizi:
	   
	    //Path destination = Paths.get("webelement-screenshot.ong");
	  //  Files.move(screenshot.toPath(), destination, REPLACE_EXISTING);
	  //  ((File) assertThat(destination)).exists();
	    
	

	//private static Object assertThat(Path destination) {
		// TODO Auto-generated method stub
		//return null;
	
	// GET height & width
	    
	    System.out.println(name.getRect().getDimension().getHeight());
	    System.out.println(name.getRect().getDimension().getWidth());
	    
	    
	
	
	}
	

}
