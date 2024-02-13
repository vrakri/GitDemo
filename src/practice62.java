
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class practice62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
     
		
		
		driver.findElement(By.name("name")).sendKeys("Bepo");		
		driver.findElement(By.name("email")).sendKeys("bepo@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		driver.findElement(By.id("exampleCheck1")).click();
        
		WebElement staticDropdown = driver.findElement(By.id ("exampleFormControlSelect1"));
		
		Select dropdown = new Select (staticDropdown);
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("10272008");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
	}
}
