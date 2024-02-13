import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class vjezba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
	    //Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    driver.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    driver.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    //System.out.println(driver.findElements(By.cssSelector("#checkbox-example")).size());
	    
	    //System.out.println(driver.findElements(By.cssSelector("input[value='checkbox']")).size()); - rahul's kod, doesn't work
	    
	    
	}

}
