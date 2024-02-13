import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignment {

	public static void main(String[] args) {

String text = "Bepo";
System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
WebDriver driver = new ChromeDriver(options);
driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
driver.findElement(By.id("name")).sendKeys(text);

driver.findElement(By.id("alertbtn")).click();

System.out.println(driver.switchTo().alert().getText()); // da se isprinta/prikaze tekst koji se nalazi u alertu
driver.switchTo().alert().accept(); //metoda kojom se prelazi na alert kojeg se accepta, kada postoji samo ok bottun


driver.findElement(By.id("confirmbtn")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss(); // metoda kada prelazimo na alert, kojeg ne želimo prihvatiti

	}

}
