import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bepo");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("bepo.vrankulj@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("be.vrankulj@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys ("123456");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("reset-pwd-btn")));
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();

		//driver.get("https://www-dc1.stage.ifortuna.cz/");
		//driver.findElement(By.id("cookie-consent-button-accept")).click();
		//driver.findElement(By.className("user-box-link user-box-login-button")).click();
		
		
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		//<button class="submit signInBtn" type="submit">Sign In</button>
		//* Incorrect username or password
		//<p class="error">* Incorrect username or password </p>
		//<a href="#">Forgot your password?</a>
		//<input type="text" placeholder="Name">
		//input[@placeholder='Name']
		//<input type="text" placeholder="Email"> input[placeholder='Email']
		//<input type="text" placeholder="Phone Number">
		//<button class="reset-pwd-btn">Reset Login</button>
		//<button class="go-to-login-btn">Go to Login</button>
			
		//<p class="infoMsg">Please use temporary password 'rahulshettyacademy' to Login. </p>
	}


}
