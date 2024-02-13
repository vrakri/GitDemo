import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://corporate.spicejet.com");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='MAA'][normalize-space()='Chennai (MAA)'])[2]")).click(); // ovo je
																											// xpath
																											// ponuđen u
																											// selectorshubu

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByVisibleText("4");

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		// - sve opcije posljednje linije/vježba
		// driver.findElement(By.cssSelector("input[value='Search']")).click();
		// driver.findElement(By.cssSelector("input[type='submit']")).click();
		// driver.findElement(By.xpath("//input[@value='Search']")).click();
		// driver.findElement(By.xpath("//input[@type='submit']")).click();
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}
}