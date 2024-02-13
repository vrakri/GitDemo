import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class vježba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
		
		String option = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		
		WebElement staticDropdown = driver.findElement(By.id ("dropdown-class-example"));
		
        Select dropdown = new Select (staticDropdown);
        dropdown.selectByVisibleText(option);
        
        driver.findElement(By.id("name")).sendKeys(option);
        driver.findElement(By.id("alertbtn")).click();
        
               
        Alert alert = driver.switchTo().alert(); //da se prebaci na alert, i da vidi sadrži li tekst alerta dio teksta iz dropdowna..
        alert.getText();
        
        if (alert.getText().contains(option))
	    {
	    	System.out.print(true);
	    } 
        else
        	
        	System.out.print(false);
        		}
        
	}


